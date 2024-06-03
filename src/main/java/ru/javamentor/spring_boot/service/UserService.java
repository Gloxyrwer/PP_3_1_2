package ru.javamentor.spring_boot.service;

import ru.javamentor.spring_boot.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    List<User> getAllUsers();

    void updateUser(int id, User user);

    void deleteUser(int id);
}
