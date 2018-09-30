package com.sherlockkk.serviceInterface;

import com.sherlockkk.domain.User;

import java.util.List;

public interface UserServiceInterface {
    void save(User user);

    User findUserById(String uid);

    List<User> findAll();
}
