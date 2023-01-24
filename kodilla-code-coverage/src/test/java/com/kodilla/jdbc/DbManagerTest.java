package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractMap;
import java.util.List;

class DbManagerTest {
    private static DbManager dbManager;

    @BeforeAll
    static void setUp() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    void testConnection() {
        //Given
        //When
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
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
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //GIVEN
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);

        //WHEN
        String sqlQuery = "SELECT USERS.FIRSTNAME, USERS.LASTNAME\n" +
                "FROM USERS\n" +
                "INNER JOIN POSTS ON USERS.ID=POSTS.USER_ID\n" +
                "GROUP BY USERS.ID\n" +
                "HAVING COUNT(*) >= 2;";
        Statement pStatement = dbManager.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rs = pStatement.executeQuery(sqlQuery);

        //THEN
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2));
        }
        rs.beforeFirst();
        int actual = getTrueResultCount(rs);

        Assertions.assertEquals(4, actual);
    }

    private static int getResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while (rs.next()) {
            System.out.printf("%d, %s, %s%n",
                    rs.getInt("ID"),
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));
            counter++;
        }
        return counter;
    }

    private static int getTrueResultCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while (rs.next()) {
            counter++;
        }
        return counter;
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

    private Statement createStatement() throws SQLException {
        return dbManager.getConnection().createStatement();
    }

    private static int getRowsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        return count;
    }
}