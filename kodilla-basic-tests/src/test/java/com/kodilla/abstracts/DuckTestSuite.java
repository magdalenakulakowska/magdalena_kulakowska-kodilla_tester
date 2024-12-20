package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class DuckTestSuite {
    Animal duck = new Duck();

    @Test
    void testDogLegsCount() {
        int expected = 2;

        assertEquals(expected, duck.getNumberOfLegs());
    }

    @Test
    void testGiveVoiceFunction() {
        // Given
        Animal duck = new Duck();

        // When & Then
        duck.giveVoice();
    }

    @Test
    void testGiveVoice() {
        Animal mockedDuck = Mockito.mock(Duck.class);

        doNothing().when(mockedDuck).giveVoice();

        // When
        mockedDuck.giveVoice();

        // Then
        verify(mockedDuck, times(1)).giveVoice();
    }
}