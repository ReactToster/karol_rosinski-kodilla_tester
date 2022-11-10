package com.kodilla.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    private List<String> usernames;
    private List<String> expectedUsernames;
    private List<User> users;
    private List<User> expectedUsers;

    @BeforeEach
    public void setUp() {
        usernames = new ArrayList<>();
        expectedUsernames = new ArrayList<>();
        users = new ArrayList<>();
        expectedUsers = new ArrayList<>();
    }

    @Test
    public void testIfFilterChemistsGroupUserNameReturnsCorrectValues() {
        // when
        usernames = UsersManager.filterChemistsGroupUsernames();
        // then
        expectedUsernames.add("Walter White");
        expectedUsernames.add("Gale Boetticher");
        assertEquals(expectedUsernames, usernames);
    }

    @Test
    public void testIfGetUsersOlderThanGivenAgeReturnsCorrectValues() {
        // when
        users = UsersManager.getUsersOlderThanGivenAge(49);
        // then
        expectedUsers.add(new User("Walter White", 50, 7, "Chemists"));
        expectedUsers.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedUsers, users);
    }
}