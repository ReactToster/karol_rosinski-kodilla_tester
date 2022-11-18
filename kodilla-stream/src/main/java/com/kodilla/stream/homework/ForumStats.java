package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

import java.util.List;

public class ForumStats {
    private final int age = 40;
    public static void main(String[] args) {
        ForumStats forumStats = new ForumStats();

        System.out.println("Average Number of posts for users younger than 40: " + forumStats.calculateAverageNumberOfPostsForUsersYoungerThanGivenAge(UserRepository.getUsersList()) +
                "\n" +
                        "Average Number of posts for users older or equal to 40: " + forumStats.calculateAverageNumberOfPostsForUsersOlderOrEqualToGivenAge(UserRepository.getUsersList())
                );
    }

    public double calculateAverageNumberOfPostsForUsersOlderOrEqualToGivenAge(List<User> users) {
        return users
                .stream()
                .filter(user -> user.getAge() >= age)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public double calculateAverageNumberOfPostsForUsersYoungerThanGivenAge(List<User> users) {
        return users
                .stream()
                .filter(user -> user.getAge() < age)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }
}
