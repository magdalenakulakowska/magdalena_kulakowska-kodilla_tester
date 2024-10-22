package com.kodilla.execution_model.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.time.LocalDate;
import java.util.stream.Stream;

public class ShopSources {
    static Stream<Arguments> provideOrdersForTestingShopWithException() {
        return Stream.of(
                Arguments.of(0.0, LocalDate.of(2023, 10, 1), "abcde"),
                Arguments.of(-1.1, LocalDate.of(2024, 6, 1), "login2"),
                Arguments.of(56.3, LocalDate.of(2024, 2, 28), "")
        );
    }
}
