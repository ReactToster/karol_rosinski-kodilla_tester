package com.kodilla.exception.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WareHouseTestSuite {
    private WareHouse wareHouse;

    @BeforeEach
    public void setUp() {
        wareHouse = new WareHouse();
        wareHouse.addOrder(new Order("000001"));
    }

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        // when
        Order order = wareHouse.getOrder("000001");
        // then
        assertEquals(new Order("000001"), order);
    }

    @Test
    public void testGetOrder_withException() throws OrderDoesntExistException {
        // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> wareHouse.getOrder("000002"));
    }
}