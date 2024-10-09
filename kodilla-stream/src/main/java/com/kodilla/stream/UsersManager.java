package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<User> usersOlderThanMinAge = filterUsersOlderThanMinAge(35);
        System.out.println(usersOlderThanMinAge);

        List<String> usersFilteredByMinAgeAndMinPostNumber = filterUsersByMinAgeAndMinNumberOfPosts(30, 5);
        System.out.println(usersFilteredByMinAgeAndMinPostNumber);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<User> filterUsersOlderThanMinAge(int minAge) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > minAge)
                .toList();
    }

    public static List<String> filterUsersByMinAgeAndMinNumberOfPosts(int minAge, int minNumberOfPosts) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> (user.getAge() > minAge && user.getNumberOfPost() > minNumberOfPosts))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
    }
}
