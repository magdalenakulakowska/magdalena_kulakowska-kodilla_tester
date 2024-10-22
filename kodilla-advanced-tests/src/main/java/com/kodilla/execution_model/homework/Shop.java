package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addNewOrder(Order order) throws InvalidOrderException {
        validateOrder(order);
        orders.add(order);
    }

    private void validateOrder(Order order) throws InvalidOrderException{
        if(order.getOrderValue() <= 0.0 || order.getLogin().isEmpty()){
            throw new InvalidOrderException();
        }
    }

    public Set<Order> getOrdersBetweenDates(LocalDate startDate, LocalDate endDate) {
        return orders
                .stream()
                .filter(order -> (order.getDate().isAfter(startDate) || order.getDate().equals(startDate))  &&
                        (order.getDate().isBefore(endDate) || order.getDate().equals(endDate)))
                .collect(Collectors.toSet());
    }

    public Set<Order> getOrdersBetweenValues(double minValue, double maxValue) {
        return orders
                .stream()
                .filter(order -> order.getOrderValue() >= minValue && order.getOrderValue() <= maxValue)
                .collect(Collectors.toSet());
    }

    public int getOrdersSize() {
        return orders.size();
    }

    public double getOrdersValue() {
        double value = 0.0;

        for(Order order : orders){
            value += order.getOrderValue();
        }

        return value;
    }
}
