package com.kodilla;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ColorTestSuite {

    @Test
    void testSelectColor_Red() {
        String mockInput = "R\n";
        InputStream inputStream = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(inputStream);

        Color color = new Color();

        String selectedColor = color.selectColor();

        assertEquals("Red", selectedColor);
    }

    @Test
    void testSelectColor_Green() {
        String mockInput = "G\n";
        InputStream inputStream = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(inputStream);

        Color color = new Color();

        String selectedColor = color.selectColor();

        assertEquals("Green", selectedColor);
    }

    @Test
    void testSelectColor_Blue() {
        String mockInput = "B\n";
        InputStream inputStream = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(inputStream);

        Color color = new Color();

        String selectedColor = color.selectColor();

        assertEquals("Blue", selectedColor);
    }

    @Test
    void testSelectColor_WrongInput() {
        String mockInput = "X\n";
        InputStream inputStream = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(inputStream);

        Color color = new Color();

        String selectedColor = color.selectColor();

        assertEquals("Wrong color selected.", selectedColor);
    }
}