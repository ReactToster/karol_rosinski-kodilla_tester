package com.kodilla.stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistsGroupUsernames = filterChemistsGroupUsernames();
        System.out.println(chemistsGroupUsernames);
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<String> filterChemistsGroupUsernames() {
        List<String> usernames = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static List<User> getUsersOlderThanGivenAge(int age) {
        List<User> users = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());

        return users;
    }

    public static List<User> getUsersWithNumberOfPostsLesserThanNumber(int numberOfPosts) {
        List<User> users = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() < numberOfPosts)
                .collect(Collectors.toList());

        return users;
    }
}
