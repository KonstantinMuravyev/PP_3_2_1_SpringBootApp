package ru.muravyev.PP_3_2_1_SpringBootApp.service;


import ru.muravyev.PP_3_2_1_SpringBootApp.model.User;

import java.util.List;

public interface UserService {
    User getUserById(long id);

    void updateUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    void saveUser (User user);
}