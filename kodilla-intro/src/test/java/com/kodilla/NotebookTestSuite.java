package com.kodilla;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NotebookTestSuite {

    @Test
    void testCheckPriceCheap() {
        Notebook notebook = new Notebook(1000, 500, 2015);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        notebook.checkPrice();

        assertEquals("This notebook is very cheap", outputStream.toString().trim());
    }

    @Test
    void testCheckPriceGood() {
        Notebook notebook = new Notebook(1000, 800, 2015);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        notebook.checkPrice();

        assertEquals("This price is good", outputStream.toString().trim());
    }

    @Test
    void testCheckPriceExpensive() {
        Notebook notebook = new Notebook(1000, 1200, 2015);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        notebook.checkPrice();

        assertEquals("This notebook is expensive", outputStream.toString().trim());
    }

    @Test
    void testCheckWeightLight() {
        Notebook notebook = new Notebook(700, 800, 2015);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        notebook.checkWeight();

        assertEquals("This notebook is light", outputStream.toString().trim());
    }

    @Test
    void testCheckWeightNotTooHeavy() {
        Notebook notebook = new Notebook(1000, 800, 2015);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        notebook.checkWeight();

        assertEquals("This notebook is not too heavy", outputStream.toString().trim());
    }

    @Test
    void testCheckWeightVeryHeavy() {
        Notebook notebook = new Notebook(1300, 800, 2015);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        notebook.checkWeight();

        assertEquals("This notebook is very heavy", outputStream.toString().trim());
    }

    @Test
    void testCheckYearOld() {
        Notebook notebook = new Notebook(1000, 800, 2005);

        String year = notebook.checkYear();

        assertEquals("old", year);
    }

    @Test
    void testCheckYearNotSoOld() {
        Notebook notebook = new Notebook(1000, 800, 2015);

        String year = notebook.checkYear();

        assertEquals("not so old", year);
    }

    @Test
    void testCheckYearNew() {
        Notebook notebook = new Notebook(1000, 800, 2022);

        String year = notebook.checkYear();

        assertEquals("new", year);
    }

    @Test
    void testCheckPriceAndYearCheapOld() {
        Notebook notebook = new Notebook(1000, 500, 2005);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        notebook.checkPriceAndYear();

        assertEquals("This notebook is very cheap and old", outputStream.toString().trim());
    }
}