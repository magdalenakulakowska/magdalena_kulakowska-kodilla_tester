package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers_valid.csv", numLinesToSkip = 1)
    public void testHowManyWins(int number1, int number2, int number3, int number4, int number5, int number6, int expectedWins) throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine(){
            @Override
            protected Set<Integer> generateComputerNumbers(){
                return Set.of(1,2,3,4,5,6);
            }
        };
        Set<Integer> userNumbers = Set.of(number1, number2, number3, number4, number5, number6);

        int actualWins = gamblingMachine.howManyWins(userNumbers);

        assertEquals(expectedWins, actualWins);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers_invalid.csv", numLinesToSkip = 1)
    public void testHowManyWins_withExceptionForNumbersOutOfScope(int number1, int number2, int number3, int number4, int number5, int number6){
        GamblingMachine gamblingMachine = new GamblingMachine(){};
        Set<Integer> userNumbers = Set.of(number1, number2, number3, number4, number5, number6);

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 2, 3, 4, 5, 6, 7", "-1,4,5,6,34,78,98"})
    public void testHowManyWins_withExceptionForTooManyNumbers(int number1, int number2, int number3, int number4, int number5, int number6, int number7){
        GamblingMachine gamblingMachine = new GamblingMachine(){};
        Set<Integer> userNumbers = Set.of(number1, number2, number3, number4, number5, number6, number7);

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 2, 3, 4, 5", "-5,60,5,4,3"})
    public void testHowManyWins_withExceptionForTooLittleNumbers(int number1, int number2, int number3, int number4, int number5){
        GamblingMachine gamblingMachine = new GamblingMachine(){};
        Set<Integer> userNumbers = Set.of(number1, number2, number3, number4, number5);

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @EmptySource
    public void testHowManyWins_withExceptionForEmpty(Set<Integer> numbers) {
        GamblingMachine gamblingMachine = new GamblingMachine(){};

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @NullSource
    public void testHowManyWins_withExceptionForNull(Set<Integer> numbers) {
        GamblingMachine gamblingMachine = new GamblingMachine(){};

        assertThrows(NullPointerException.class, () -> gamblingMachine.howManyWins(numbers));
    }
}