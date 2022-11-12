package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    private ForumStats forumStats;
    private List<User> testUsers;

    @BeforeEach
    public void setForumStatsData() {
        forumStats = new ForumStats();
        testUsers = new ArrayList<>();
        testUsers.add(new User("ronald", 41, 21, "Stronghold"));
        testUsers.add(new User("LegendarySlayer", 18, 256, "Stronghold"));
        testUsers.add(new User("Butterfly111", 50, 51, "Castle"));
        testUsers.add(new User("final_gambit", 30, 221, "Fortress"));
        testUsers.add(new User("david.johnson", 40, 540, "Castle"));
    }

    @Test
    public void testCalculateAverageNumberOfPostsForUsersOlderOrEqualToGivenAge() {
        // when
        double averageNumberOfPosts = forumStats.calculateAverageNumberOfPostsForUsersOlderOrEqualToGivenAge(testUsers);
        // then
        assertEquals(204, averageNumberOfPosts, 0.001);
    }
}