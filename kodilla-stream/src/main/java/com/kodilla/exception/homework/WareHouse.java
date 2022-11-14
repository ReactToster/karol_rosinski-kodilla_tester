package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class WareHouse {
    private Set<Order> orderList = new HashSet<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
          Optional<Order> orderOptional =  orderList
                    .stream()
                    .filter(order1 -> order1.getNumber().equals(number))
                    .findFirst();

          if (orderOptional.isPresent())
              return orderOptional.get();
          throw new OrderDoesntExistException();
    }
}
