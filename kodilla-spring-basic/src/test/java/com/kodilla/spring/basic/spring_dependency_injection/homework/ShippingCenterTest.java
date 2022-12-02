package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ShippingCenterTest {
    private ApplicationContext context;
    private ShippingCenter shippingCenter;
    private DeliveryService deliveryService;
    private NotificationService notificationService;


    @BeforeEach
    public void setUpApplicationContext() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        shippingCenter = context.getBean(ShippingCenter.class);
        deliveryService = context.getBean(DeliveryService.class);
        notificationService = context.getBean(NotificationService.class);
    }

    @Test
    public void shouldCorrectlySendPackage() {
        Assertions.assertEquals("Package delivered to: Hill Street 11, New York", shippingCenter.sendPackage("Hill Street 11, New York", 18.2));
    }

    @Test
    public void shouldReturnFailMessageOnTooHeavyPackage() {
        Assertions.assertEquals("Package not delivered to: Hill Street 11, New York", shippingCenter.sendPackage("Hill Street 11, New York", 30.01));
    }
}