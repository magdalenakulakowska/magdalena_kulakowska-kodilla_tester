package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTestSuite {
    Order order = new Order("12345");

    @Test
    void testGetNumber() {
        assertEquals("12345", order.getNumber());
    }

    @Test
    void testEquals_SameObject() {
        Order order2 = order;
        assertEquals(order, order2);
    }

    @Test
    void testEquals_DifferentObjectWithSameNumber() {
        Order order2 = new Order("12345");
        assertEquals(order, order2);
    }

    @Test
    void testEquals_DifferentObjectWithDifferentNumber() {
        Order order2 = new Order("67890");
        assertNotEquals(order, order2);
    }

    @Test
    void testEquals_NullObject() {
        assertNotEquals(null, order);
    }

    @Test
    void testEquals_DifferentClass() {
        String notOrder = "Not an order";
        assertNotEquals(order, notOrder);
    }

    @Test
    void testHashCode_SameOrder() {
        Order order2 = new Order("12345");
        assertEquals(order.hashCode(), order2.hashCode());
    }

    @Test
    void testHashCode_DifferentOrder() {
        Order order2 = new Order("67890");
        assertNotEquals(order.hashCode(), order2.hashCode());
    }
}