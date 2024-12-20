package com.kodilla;

public class User {
    String name;
    int age;

    public User (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        /* com.kodilla.User */
        User[] users = {
                new User("Magda", 32),
                new User("Kasia", 12),
                new User("Zbigniew", 50),
                new User("Andrzej", 43),
                new User("Monika", 24),
                new User("Joanna", 18),
                new User("Krystian", 66)
        };

        int averageAge = checkAverageAge(users);
        int usersLength = users.length;

        System.out.println("average age: " + averageAge);

        checkUsersWithAgeBelowAverage(averageAge, usersLength, users);
    }

    public static int checkAverageAge (User[] users) {
        int sum = 0;
        int usersLength = users.length;

        for (int i = 0; i < usersLength; i++) {
            sum += users[i].age;
        }

        return sum/usersLength;
    }

    public static void checkUsersWithAgeBelowAverage (int averageAge, int usersLength, User[] users) {
        for (int i = 0; i < usersLength; i ++) {
            if(users[i].age < averageAge) {
                System.out.println("user name: " + (users[i].name));
            }
        }
    }
}
