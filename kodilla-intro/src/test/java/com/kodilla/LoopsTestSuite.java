package com.kodilla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopsTestSuite {

    @Test
    void testForLoopCounter() {
        StringBuilder expectedOutput = new StringBuilder();
        for (int i = 0; i <= 10; i++) {
            expectedOutput.append(i).append("\n");
        }

        StringBuilder actualOutput = new StringBuilder();
        for (int i = 0; i <= 10; i++) {
            actualOutput.append(i).append("\n");
        }

        assertEquals(expectedOutput.toString().replaceAll("\r\n|\n|\r", "\n").trim(), actualOutput.toString().replaceAll("\r\n|\n|\r", "\n").trim());
    }

    @Test
    void testForLoopPrintingNames() {
        String[] names = {"Zygfryd", "Gwidon", "Florentyna"};
        StringBuilder expectedOutput = new StringBuilder();
        for (String name : names) {
            expectedOutput.append(name).append("\n");
        }

        StringBuilder actualOutput = new StringBuilder();
        for (String name : names) {
            actualOutput.append(name).append("\n");
        }

        assertEquals(expectedOutput.toString().replaceAll("\r\n|\n|\r", "\n").trim(), actualOutput.toString().replaceAll("\r\n|\n|\r", "\n").trim());
    }

    @Test
    void testSumAllArrayElements() {
        int[] numbers = {1, 2, 3};
        int expectedSum = 6;

        int actualSum = Loops.sumAllArrayElements(numbers);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testWhileLoopCounter() {
        StringBuilder expectedOutput = new StringBuilder();
        int i = 0;
        while (i <= 10) {
            expectedOutput.append(i).append("\n");
            i++;
        }

        StringBuilder actualOutput = new StringBuilder();
        i = 0;
        while (i <= 10) {
            actualOutput.append(i).append("\n");
            i++;
        }

        assertEquals(expectedOutput.toString().replaceAll("\r\n|\n|\r", "\n").trim(), actualOutput.toString().replaceAll("\r\n|\n|\r", "\n").trim());
    }
}