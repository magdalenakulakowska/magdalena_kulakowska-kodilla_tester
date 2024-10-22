package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(1535.23, LocalDate.of(2024, 10, 21), "anna95");
    Order order2 = new Order(234.0, LocalDate.of(2024, 8, 12), "wilku12");
    Order order3 = new Order(599.99, LocalDate.of(2024, 6, 6), "krzysiek1");
    Order order4 = new Order(1230.0, LocalDate.of(2023, 12, 1), "login1");

    @Test
    public void shouldAddNewOrders(){
        shop.addNewOrder(new Order(25.0, LocalDate.of(2024, 9, 10), "login3"));
        int numberOfOrders = shop.getOrdersSize();

        assertEquals(5, numberOfOrders);
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.execution_model.homework.ShopSources#provideOrdersForTestingShopWithException")
    public void shouldThrowExceptionWhenAddingOrderWithInvalidData(double value, LocalDate date, String login){
        assertThrows(InvalidOrderException.class, () -> shop.addNewOrder(new Order(value, date, login)));
    }

    @Test
    public void shouldHaveUniqueOrders(){
        shop.addNewOrder(order1);

        int numberOfOrders = shop.getOrdersSize();

        assertEquals(4, numberOfOrders);
    }

    @Test
    public void shouldReturnCorrectSetOfOrdersBetweenGivenDates(){
        Set<Order> expectedOrders = Set.of(order2, order3);

        Set<Order> orders = shop.getOrdersBetweenDates(LocalDate.of(2024, 6, 1), LocalDate.of(2024,8,31));

        assertEquals(expectedOrders, orders);
    }

    @Test
    public void shouldReturnEmptySetWhenNoOrdersBetweenGivenDates(){
        Set<Order> expectedOrders = new HashSet<>();

        Set<Order> orders = shop.getOrdersBetweenDates(LocalDate.of(2022, 6, 1), LocalDate.of(2022,8,31));

        assertEquals(expectedOrders, orders);
    }

    @Test
    public void shouldReturnCorrectSetOfOrdersBetweenGivenValues(){
        Set<Order> expectedOrders = Set.of(order2, order3);

        Set<Order> orders = shop.getOrdersBetweenValues(100.0, 1000.0);

        assertEquals(expectedOrders, orders);
    }

    @Test
    public void shouldReturnEmptySetWhenNoOrdersBetweenGivenValues(){
        Set<Order> expectedOrders = new HashSet<>();

        Set<Order> orders = shop.getOrdersBetweenValues(0.0, 50.0);

        assertEquals(expectedOrders, orders);
    }

    @Test
    public void shouldGetCorrectOrderSize(){
        int numberOfOrders = shop.getOrdersSize();

        assertEquals(4, numberOfOrders);
    }

    @Test
    public void shouldReturnCorrectValueOfOrders(){
        double value = shop.getOrdersValue();

        assertEquals(3599.22, value, 0.0001);
    }

    @BeforeEach
    public void initializeShop(){
        shop.addNewOrder(order1);
        shop.addNewOrder(order2);
        shop.addNewOrder(order3);
        shop.addNewOrder(order4);
    }
}