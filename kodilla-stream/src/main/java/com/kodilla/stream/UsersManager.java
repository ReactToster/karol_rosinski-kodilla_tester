package com.kodilla.stream;

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
}
