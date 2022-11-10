package com.kodilla.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    private List<String> usernames;
    private List<String> expectedUsernames;

    @BeforeEach
    public void setUp() {
        usernames = Collections.emptyList();
        expectedUsernames = new ArrayList<>();
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

}