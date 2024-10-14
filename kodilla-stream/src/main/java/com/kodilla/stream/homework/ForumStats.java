package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ForumStats {
    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        System.out.println("Average number of post for people older than 40: " + avgPostsForOlderGroupOfPeople(users));
        System.out.println("Average number of post for people younger than 40: " + avgPostsForYoungerGroupOfPeople(users));
    }

    public static double avgPostsForOlderGroupOfPeople(List<User> users){
        List<User> filteredUsers = users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .collect(Collectors.toCollection(ArrayList::new));

        return getAveragePosts(filteredUsers);
    }

    public static double avgPostsForYoungerGroupOfPeople(List<User> users){
        List<User> filteredUsers = users
                .stream()
                .filter(user -> user.getAge() < 40)
                .toList();

        return getAveragePosts(filteredUsers);
    }

    public static double getAveragePosts(List<User> users){
        if(users.isEmpty()){
            return 0.0;
        }

        return users
                .stream()
                .mapToInt(User::getNumberOfPost)
                .average()
                .getAsDouble();
    }
}
