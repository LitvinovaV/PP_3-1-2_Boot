package ru.spring.PP_312_Boot.service;


import ru.spring.PP_312_Boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser (User user);
    User getUser (long id);
    void deletUser (long id);
}
