package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double orderValue;
    private LocalDate orderDate;
    private String buyerLogin;

    public Order(double orderValue, String orderDate, String buyerLogin) {
        this.orderValue = orderValue;
        this.orderDate = LocalDate.parse(orderDate);
        this.buyerLogin = buyerLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.orderValue, orderValue) == 0 && Objects.equals(orderDate, order.orderDate) && Objects.equals(buyerLogin, order.buyerLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderValue, orderDate, buyerLogin);
    }

    public String getBuyerLogin() {
        return buyerLogin;
    }
}
