package com.kodilla.exception.homework;

import java.util.Random;

public class WareHouseApp {
    public static void main(String[] args) {
        String orderRequestedNumber = "MissingNo";
        Random random = new Random();
        WareHouse wareHouse = new WareHouse();
        for (int i = 0; i < 15; i++) {
            wareHouse.addOrder(new Order("000" + (random.nextInt(999))));
        }

        try {
            wareHouse.getOrder(orderRequestedNumber);
            System.out.println("Found order: " + orderRequestedNumber);
        } catch (OrderDoesntExistException e) {
            e.printStackTrace();
            System.out.println("Order " + orderRequestedNumber + " doesn't exist");
        }
    }
}
