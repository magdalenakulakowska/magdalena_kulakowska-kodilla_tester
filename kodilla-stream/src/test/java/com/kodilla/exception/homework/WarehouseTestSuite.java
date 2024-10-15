package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("65"));
        warehouse.addOrder(new Order("32"));

        //when
        Order order = warehouse.getOrder("32");

        //then
        assertEquals(new Order("32"), order);
    }

    @Test
    public void testGetOrder_withException(){
        //given
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("65"));
        warehouse.addOrder(new Order("32"));

        //when

        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("5"));
    }
}