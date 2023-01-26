package ru.spring.PP_312_Boot.dao;



import ru.spring.PP_312_Boot.model.User;

import java.util.List;

public interface UserDao {
    User getUser(long id);

    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUser(long id);
}
