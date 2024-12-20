package com.kodilla.jdbc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DbManagerTestSuite {
    private static DbManager dbManager;

    @BeforeAll
    public static void setup() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    void testConnect() {
        //Given
        //When
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getResultsCount(rs);
        int expected = count + 5;
        assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException{
        //Given
        String countQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) FROM USERS U " +
                "JOIN POSTS P ON U.ID = P.USER_ID GROUP BY U.ID HAVING COUNT(*) >= 2";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getPostsRowsCount(rs);
        insertUsers(statement);
        String sqlQuery = "SELECT * FROM USERS";
        statement = createStatement();
        ResultSet rsUsers = statement.executeQuery(sqlQuery);
        int lastUserId = getLastUserId(rsUsers);
        insertPosts(statement, lastUserId);

        //When
        sqlQuery = "SELECT * FROM POSTS";
        statement = createStatement();
        ResultSet rsPosts = statement.executeQuery(sqlQuery);

        //Then
        int counter = getUsersWithAtLeastTwoPostsCount(rsPosts);
        int expected = count + 1;
        assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    private Statement createStatement() throws SQLException {
        return dbManager.getConnection().createStatement();
    }

    private void insertPosts(Statement statement, int lastUserId) throws SQLException {
        final List<AbstractMap.SimpleEntry<Integer, String>> posts = List.of(
                new AbstractMap.SimpleEntry<>(lastUserId, "Example post body 1"),
                new AbstractMap.SimpleEntry<>(lastUserId, "Example post body 2"),
                new AbstractMap.SimpleEntry<>(lastUserId, "Example post body 3")
        );

        for (AbstractMap.SimpleEntry<Integer, String> post : posts) {
            statement.executeUpdate(
                    String.format("INSERT INTO POSTS(USER_ID, BODY) VALUES ('%s', '%s')",
                            post.getKey(),
                            post.getValue()
                    )
            );
        }
    }

    private static final List<AbstractMap.SimpleEntry<String, String>> USERS = List.of(
            new AbstractMap.SimpleEntry<>("Zara", "Ali"),
            new AbstractMap.SimpleEntry<>("Otman", "Use"),
            new AbstractMap.SimpleEntry<>("Mark", "Boq"),
            new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
            new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
    );

    private void insertUsers(Statement statement) throws SQLException {
        for (AbstractMap.SimpleEntry<String, String> user : USERS) {
            statement.executeUpdate(
                    String.format("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('%s', '%s')",
                            user.getKey(),
                            user.getValue()
                    )
            );
        }
    }

    private static int getResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while(rs.next()) {
            System.out.printf("%d, %s, %s%n",
                    rs.getInt("ID"),
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));
            counter++;
        }
        return counter;
    }

    private static int getUsersWithAtLeastTwoPostsCount(ResultSet rsPosts) throws SQLException {
        Map<Integer, Integer> userPostCount = new HashMap<>();

        while(rsPosts.next()) {
            int userId = rsPosts.getInt("USER_ID");
            userPostCount.put(userId, userPostCount.getOrDefault(userId, 0) + 1);
        }

        int count = 0;
        for (int postCount : userPostCount.values()) {
            if (postCount >= 2) {
                count++;
            }
        }

        return count;
    }

    private static int getRowsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        return count;
    }

    private static int getPostsRowsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count += 1;
        }
        return count;
    }

    private static int getLastUserId(ResultSet rs) throws SQLException {
        int userId = 0;
        while (rs.next()) {
            userId = rs.getInt("ID");
        }
        return userId;
    }
}