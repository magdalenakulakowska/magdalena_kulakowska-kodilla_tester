package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.homework.ForumStats.avgPostsForOlderGroupOfPeople;
import static com.kodilla.stream.homework.ForumStats.avgPostsForYoungerGroupOfPeople;
import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTestSuite {

    @Test
    public void testAvgPostsForOlderGroupOfPeople() {
        List<User> users = new ArrayList<>();

        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));

        double result = avgPostsForOlderGroupOfPeople(users);

        assertEquals(3.5, result, 0.001);
    }

    @Test
    public void testAvgPostsForYoungerGroupOfPeople() {
        List<User> users = new ArrayList<>();

        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));

        double result = avgPostsForYoungerGroupOfPeople(users);

        assertEquals(2382.0, result, 0.001);
    }

    @Test
    public void testAvgPostsForOlderGroupOfPeopleWhenZeroPosts() {
        List<User> users = new ArrayList<>();

        users.add(new User("Walter White", 50, 0, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));

        double result = avgPostsForOlderGroupOfPeople(users);

        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testAvgPostsForYoungerGroupOfPeopleWhenZeroPosts() {
        List<User> users = new ArrayList<>();

        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 0, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 0, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));

        double result = avgPostsForYoungerGroupOfPeople(users);

        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testAvgPostsForOlderGroupOfPeopleWhenGroupIsEmpty() {
        List<User> users = new ArrayList<>();

        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));

        double result = avgPostsForOlderGroupOfPeople(users);

        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testAvgPostsForYoungerGroupOfPeopleWhenGroupIsEmpty() {
        List<User> users = new ArrayList<>();

        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Gus Firing", 49, 0, "Board"));

        double result = avgPostsForYoungerGroupOfPeople(users);

        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testAvgPostsForOlderGroupOfPeopleWhenListIsEmpty() {
        List<User> users = new ArrayList<>();

        double result = avgPostsForOlderGroupOfPeople(users);

        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testAvgPostsForYoungerGroupOfPeopleWhenListIsEmpty() {
        List<User> users = new ArrayList<>();

        double result = avgPostsForYoungerGroupOfPeople(users);

        assertEquals(0.0, result, 0.001);
    }
}