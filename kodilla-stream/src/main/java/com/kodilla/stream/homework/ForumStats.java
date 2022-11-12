package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

import java.util.List;

public class ForumStats {

    public static void main(String[] args) {
        ForumStats forumStats = new ForumStats();
        System.out.println("Average Number of posts for users younger than 40: " + forumStats.calculateAverageNumberOfPostsForUsersYoungerThan40(UserRepository.getUsersList()) +
                "\n" +
                        "Average Number of posts for users older or equal to 40: " + forumStats.calculateAverageNumberOfPostsForUsersOlderOrEqualTo40(UserRepository.getUsersList())
                );

    }

    public double calculateAverageNumberOfPostsForUsersOlderOrEqualTo40(List<User> users) {
        return 0.0;
    }

    public double calculateAverageNumberOfPostsForUsersYoungerThan40(List<User> users) {
        return 0.0;
    }
}
