package com.kodilla.collections.sets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTestSuite {
    Order order = new Order("12345", "Laptop", 3);

    @Test
    void testGetOrderNumber() {
        assertEquals("12345", order.getOrderNumber());
    }

    @Test
    void testGetProductName() {
        assertEquals("Laptop", order.getProductName());
    }

    @Test
    void testGetQuantity() {
        assertEquals(3.0, order.getQuantity());
    }

    @Test
    void testEquals() {
        Order order2 = new Order("12345", "Laptop", 3);
        Order order3 = new Order("54321", "Smartphone", 2);

        assertEquals(order, order2);

        assertNotEquals(order, order3);
    }

    @Test
    void testHashCode() {
        Order order2 = new Order("12345", "Laptop", 3);
        Order order3 = new Order("54321", "Smartphone", 2);

        assertEquals(order.hashCode(), order2.hashCode());

        assertNotEquals(order.hashCode(), order3.hashCode());
    }

    @Test
    void testToString() {
        String expected = "Order{orderNumber='12345', productName='Laptop', quantity=3.0}";
        assertEquals(expected, order.toString());
    }
}