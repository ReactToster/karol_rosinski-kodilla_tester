package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShopTest {
    private Shop shop;
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private final LocalDate testLocalDateStart = LocalDate.parse("01-01-2021", dateTimeFormatter);
    private final LocalDate testLocalDateFinish = LocalDate.parse("01-01-2023", dateTimeFormatter);
    private final Order orderTest1 = new Order(180.0, "10-10-2022", "dark_knight86");
    private final Order orderTest2 = new Order(100.0, "11-12-2021", "kitty325");
    private final Order orderTest3 = new Order(180.0, "01-05-2015", "test_test");
    @BeforeEach
    public void setUp() {
        shop = new Shop();
        shop.addOrder(orderTest1);
        shop.addOrder(orderTest2);
        shop.addOrder(orderTest3);
    }

    @Test
    public void testAddOrderToShop() {
        assertEquals(3, shop.getAmountOfOrders());
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

    @Test
    public void shouldReturnOrdersWithinGivenRangeOfDates() {
        // when
        Set<Order> shopOrdersRangeOFDates = shop.getOrdersWithinRange(testLocalDateStart, testLocalDateFinish);
        // then
        assertTrue(shopOrdersRangeOFDates.contains(orderTest1));
        assertTrue(shopOrdersRangeOFDates.contains(orderTest2));
        assertEquals(2, shopOrdersRangeOFDates.size());
    }

    @Test
    public void shouldReturnOrdersWithinGivenRangeOfMinAndMaxOrderValue() {
        // given
        double minOrderValue = 80.0;
        double maxOrderValue = 120.0;
        // when
        Set<Order> shopOrdersRangeOfValues = shop.getOrdersWithinRange(minOrderValue, maxOrderValue);
        // then
        assertTrue(shopOrdersRangeOfValues.contains(orderTest2));
        assertEquals(1, shopOrdersRangeOfValues.size());
    }

    @Test
    public void shouldCalculateTotalValueOfOrders() {
        assertEquals(460.0, shop.calculateTotalValue());
    }
}