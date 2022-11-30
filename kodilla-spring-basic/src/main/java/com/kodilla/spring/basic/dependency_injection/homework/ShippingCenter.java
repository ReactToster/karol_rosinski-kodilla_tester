package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {
    private DeliveryService deliveryService;
    private NotificationService notificationService;

    public ShippingCenter(DHLService dhlService, NotifyNotificationService notifyNotificationService){
        this.deliveryService = dhlService;
        this.notificationService = notifyNotificationService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
