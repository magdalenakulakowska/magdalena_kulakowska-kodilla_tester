package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.UsersManager.*;
import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTestSuite {

    @Test
    void testFilterChemistGroupUsernames() {
        //when
        List<String> result = filterChemistGroupUsernames();

        //then
        List<String> expectedList = new ArrayList<>();

        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");

        assertEquals(expectedList, result);
    }

    @Test
    void testFilterUsersOlderThanMinAge() {
        //when
        List<User> result = filterUsersOlderThanMinAge(35);

        //then
        List<User> expectedList = new ArrayList<>();

        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Gus Firing", 49, 0, "Board"));
        expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        assertEquals(expectedList, result);
    }

    @Test
    void testFilterUsersByMinAgeAndMinNumberOfPosts() {
        //when
        List<String> result = filterUsersByMinAgeAndMinNumberOfPosts(30, 5);

        //then
        List<String> expectedList = new ArrayList<>();

        expectedList.add("Walter White");
        expectedList.add("Tuco Salamanca");

        assertEquals(expectedList, result);
    }
}