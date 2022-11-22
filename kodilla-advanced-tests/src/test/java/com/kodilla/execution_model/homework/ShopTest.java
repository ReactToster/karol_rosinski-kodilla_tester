package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShopTest {
    Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
        shop.addOrder(new Order(180.0, "10-10-2022", "dark_knight86"));
        shop.addOrder(new Order(100.0, "11-12-2021", "kitty325"));
        shop.addOrder(new Order(180.0, "01-05-2015", "test_test"));
    }

    @Test
    public void shouldReturnOrdersNotOlderThan2Years() {

    }
}