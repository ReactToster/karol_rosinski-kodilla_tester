package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShopTest {
    private Shop shop;
    private Order orderTest1 = new Order(180.0, "10-10-2022", "dark_knight86");
    private Order orderTest2 = new Order(100.0, "11-12-2021", "kitty325");
    private Order orderTest3 = new Order(180.0, "01-05-2015", "test_test");
    @BeforeEach
    public void setUp() {
        shop = new Shop();
        shop.addOrder(orderTest1);
        shop.addOrder(orderTest2);
        shop.addOrder(orderTest3);
    }

    @Test
    public void shouldReturnOrdersNotOlderThan2Years() {
        // when
        Set<Order> shopOrdersSince2Years = shop.getOrdersSince2Years();
        // then
        assertTrue(shopOrdersSince2Years.contains(orderTest1));
        assertTrue(shopOrdersSince2Years.contains(orderTest2));
        assertEquals(2, shopOrdersSince2Years.size());
    }
}