package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        DHLService dhlService = new DHLService();
        NotifyNotificationService notifyNotificationService = new NotifyNotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(dhlService, notifyNotificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}
