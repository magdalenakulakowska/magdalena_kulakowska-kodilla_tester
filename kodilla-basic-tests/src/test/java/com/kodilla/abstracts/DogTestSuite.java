package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class DogTestSuite {
    Animal dog = new Dog();

    @Test
    void testDogLegsCount() {
        int expected = 4;

        assertEquals(expected, dog.getNumberOfLegs());
    }

    @Test
    void testGiveVoiceFunction() {
        // Given
        Animal dog = new Dog();

        // When & Then
        dog.giveVoice();
    }

    @Test
    void testGiveVoice() {
        Animal mockedDog = Mockito.mock(Dog.class);

        doNothing().when(mockedDog).giveVoice();

        // When
        mockedDog.giveVoice();

        // Then
        verify(mockedDog, times(1)).giveVoice();
    }
}