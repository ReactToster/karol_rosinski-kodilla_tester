package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders;

    public Shop() {
        this.orders = new HashSet<>();
    }

    public void addOrder(Order order){ orders.add(order); }

    public Set<Order> getOrdersSince2Years() {
        return orders.stream()
                .filter(order -> order.getOrderDate().compareTo(LocalDate.now().minusYears(2)) > 0 )
                .collect(Collectors.toSet());
    }
}
