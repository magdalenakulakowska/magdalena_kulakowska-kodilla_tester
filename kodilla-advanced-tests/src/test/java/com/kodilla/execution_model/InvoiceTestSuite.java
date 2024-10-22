package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item apple = new Item("Apple", 3.25);
    Item laptop = new Item("Laptop", 1525.99);
    Item coke = new Item("Coca-cola", 8.75);

    @Test
    public void shouldAddThreeNewItemsToList(){
        int numberOfItems = invoice.getSize();

        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldGetCorrectItemFromList(){
        Item item = invoice.getItem(1);
        String itemName = item.getName();
        double itemPrice = item.getPrice();

        assertEquals("Laptop", itemName);
        assertEquals(1525.99, itemPrice);
    }

    @Test
    public void shouldReturnNullWhenGetItemWithNegativeIndex(){
        Item item = invoice.getItem(-1);

        assertNull(item);
    }

    @Test
    public void shouldReturnNullWhenGetItemThatDoesntExists(){
        Item item = invoice.getItem(3);

        assertNull(item);
    }

    @Test
    public void shouldClearInvoice(){
        int numberOfItemsBeforeClear = invoice.getSize();

        invoice.clear();

        int numberOfItemsAfterClear = invoice.getSize();

        assertEquals(3, numberOfItemsBeforeClear);
        assertEquals(0, numberOfItemsAfterClear);
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(apple);
        invoice.addItem(laptop);
        invoice.addItem(coke);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage(){
        System.out.println("Start testing");
    }

    @AfterAll
    public static void displayGoodbyeMessage(){
        System.out.println("Finishing testing");
    }
}