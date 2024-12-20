package com.kodilla;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class UserTestSuite {

    @Test
    void testCheckAverageAge() {
        User[] users = {
                new User("Magda", 32),
                new User("Kasia", 12),
                new User("Zbigniew", 50),
                new User("Andrzej", 43),
                new User("Monika", 24),
                new User("Joanna", 18),
                new User("Krystian", 66)
        };

        int averageAge = User.checkAverageAge(users);

        assertEquals(35, averageAge);
    }

    @Test
    void testCheckUsersWithAgeBelowAverage() {
        User[] users = {
                new User("Magda", 32),
                new User("Kasia", 12),
                new User("Zbigniew", 50),
                new User("Andrzej", 43),
                new User("Monika", 24),
                new User("Joanna", 18),
                new User("Krystian", 66)
        };

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        int averageAge = User.checkAverageAge(users);
        int usersLength = users.length;
        User.checkUsersWithAgeBelowAverage(averageAge, usersLength, users);

        String expectedOutput = "user name: Magda\nuser name: Kasia\nuser name: Monika\nuser name: Joanna";
        assertEquals(expectedOutput.replaceAll("\r\n|\n|\r", "\n").trim(), outputStream.toString().replaceAll("\r\n|\n|\r", "\n").trim());
    }

    @Test
    void testCheckUsersWithAgeBelowAverageNoUsersBelowAverage() {
        User[] users = {
                new User("Magda", 40),
                new User("Zbigniew", 50),
                new User("Andrzej", 43),
                new User("Krystian", 66)
        };

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        int averageAge = User.checkAverageAge(users);
        int usersLength = users.length;
        User.checkUsersWithAgeBelowAverage(averageAge, usersLength, users);

        String expectedOutput = "user name: Magda\nuser name: Andrzej\n";
        assertEquals(expectedOutput.replaceAll("\r\n|\n|\r", "\n").trim(), outputStream.toString().replaceAll("\r\n|\n|\r", "\n").trim());
    }
}