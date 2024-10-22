package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double orderValue;
    private LocalDate date;
    private String login;

    public Order(double orderValue, LocalDate date, String login) {
        this.orderValue = orderValue;
        this.date = date;
        this.login = login;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(orderValue, order.orderValue) == 0 && Objects.equals(date, order.date) && Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderValue, date, login);
    }
}
