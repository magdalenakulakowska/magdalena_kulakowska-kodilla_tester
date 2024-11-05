package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

@Configuration
public class CarFactory {

    private final Clock clock;

    public CarFactory(Clock clock) {
        this.clock = clock;
    }

    @Bean
    public Car selectCarBySeason(){
        LocalTime currentTime = LocalTime.now(clock);
        Month currentMonth = LocalDate.now(clock).getMonth();

        if(isSummer(currentMonth)) {
            return new Cabrio(currentTime);
        } else if(isWinter(currentMonth)) {
            return new SUV(currentTime);
        } else {
            return new Sedan(currentTime);
        }
    }

    private boolean isSummer(Month currentMonth) {
        return currentMonth.equals(Month.JUNE) || currentMonth.equals(Month.JULY) || currentMonth.equals(Month.AUGUST);
    }

    private boolean isWinter(Month currentMonth) {
        return currentMonth.equals(Month.DECEMBER) || currentMonth.equals(Month.JANUARY) || currentMonth.equals(Month.FEBRUARY);
    }
}
