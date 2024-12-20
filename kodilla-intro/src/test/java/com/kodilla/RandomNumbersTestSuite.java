package com.kodilla;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumbersTestSuite {

    @Test
    void testGetNumbers() {
        RandomNumbers randomNumbers = new RandomNumbers() {
            @Override
            public void getNumbers() {
                this.numbers = new int[] {5, 10, 15, 10, 8, 9};
                this.size = 6;
            }
        };

        randomNumbers.getNumbers();

        // Check if the numbers were correctly assigned
        assertArrayEquals(new int[] {5, 10, 15, 10, 8, 9}, randomNumbers.numbers);
        assertEquals(6, randomNumbers.size);
    }

    @Test
    void testCheckSmallestNumber() {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.numbers = new int[] {5, 10, 15, 10, 8, 9};
        randomNumbers.size = 6;

        int smallestNumber = randomNumbers.checkSmallestNumber(randomNumbers.numbers);

        assertEquals(5, smallestNumber);
    }

    @Test
    void testCheckBiggestNumber() {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.numbers = new int[] {5, 10, 15, 10, 8, 9};
        randomNumbers.size = 6;

        int biggestNumber = randomNumbers.checkBiggestNumber(randomNumbers.numbers);

        assertEquals(15, biggestNumber);
    }

    @Test
    void testSumAndSize() {
        RandomNumbers randomNumbers = new RandomNumbers() {
            @Override
            public void getNumbers() {
                this.numbers = new int[] {5, 10, 15, 10, 8, 9};
                this.size = 6;
            }
        };

        randomNumbers.getNumbers();

        int sum = Arrays.stream(randomNumbers.numbers).sum();
        assertEquals(57, sum);

        assertEquals(6, randomNumbers.size);
    }
}