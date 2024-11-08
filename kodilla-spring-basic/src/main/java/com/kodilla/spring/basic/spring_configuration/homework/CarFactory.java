package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.*;

@Configuration
public class CarFactory {

    @Bean
    public Car selectCarBySeason(){
        LocalDateTime currentTime = LocalDateTime.now();
        Month currentMonth = currentTime.getMonth();

        if(isSummer(currentMonth)) {
            return new Cabrio(currentTime.toLocalTime());
        } else if(isWinter(currentMonth)) {
            return new SUV(currentTime.toLocalTime());
        } else {
            return new Sedan(currentTime.toLocalTime());
        }
    }

    private boolean isSummer(Month currentMonth) {
        return currentMonth.equals(Month.JUNE) || currentMonth.equals(Month.JULY) || currentMonth.equals(Month.AUGUST);
    }

    private boolean isWinter(Month currentMonth) {
        return currentMonth.equals(Month.DECEMBER) || currentMonth.equals(Month.JANUARY) || currentMonth.equals(Month.FEBRUARY);
    }
}
