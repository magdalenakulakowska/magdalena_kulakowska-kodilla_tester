package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AnimalProcessorTestSuite {
    AnimalProcessor animalProcessor = new AnimalProcessor();

    @Test
    void testProcessAnimal() {
        // Given
        Dog mockDog = Mockito.mock(Dog.class);
        when(mockDog.getNumberOfLegs()).thenReturn(4);
        doNothing().when(mockDog).giveVoice();

        // When
        animalProcessor.process(mockDog);

        // Then
        verify(mockDog, times(1)).getNumberOfLegs();  // Verify that getNumberOfLegs() was called once
        verify(mockDog, times(1)).giveVoice();
    }
}