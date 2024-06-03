package ru.javamentor.spring_boot.dao;

import ru.javamentor.spring_boot.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    List<User> getAllUsers();

    User getUser(int id);

    void updateUser(int id, User user);

    void deleteUser(int id);
}
