package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        System.out.println(getAverageAge());
    }

    public static double getAverageAge () {
        return UsersRepository.getUsersList()
                .stream()
                .mapToInt(User::getAge)
                .average()
                .getAsDouble();
    }
}
