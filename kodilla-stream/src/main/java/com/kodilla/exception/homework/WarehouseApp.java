package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("5"));
        warehouse.addOrder(new Order("64"));
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("152"));

        try {
            Order order = warehouse.getOrder("61");

            System.out.println("Your order " + order.getNumber() + " is during realisation");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesn't exist in our warehouse.");
        } finally {
            System.out.println("Thank you for using our service.");
        }
    }
}
