package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> providePersonInfoForTestingBMI() {
        return Stream.of(
                Arguments.of(42.1, 1.75, "Very severely underweight"),
                Arguments.of(48.7, 1.75, "Severely underweight"),
                Arguments.of(56.3, 1.75, "Underweight"),
                Arguments.of(66.0, 1.75, "Normal (healthy weight)"),
                Arguments.of(82.5, 1.75, "Overweight"),
                Arguments.of(93.0, 1.75, "Obese Class I (Moderately obese)"),
                Arguments.of(115.1, 1.75, "Obese Class II (Severely obese)"),
                Arguments.of(134.6, 1.75, "Obese Class III (Very severely obese)"),
                Arguments.of(149.3, 1.75, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(179.0, 1.75, "Obese Class V (Super Obese)"),
                Arguments.of(222.2, 1.75, "Obese Class VI (Hyper Obese)")
        );
    }

    static Stream<Arguments> provideInvalidPersonInfoForTestingBMI() {
        return Stream.of(
                Arguments.of(0.0, 1.75),
                Arguments.of(-5.1, 1.75, "Very severely underweight")
        );
    }
}
