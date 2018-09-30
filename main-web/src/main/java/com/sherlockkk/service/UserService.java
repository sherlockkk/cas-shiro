package com.sherlockkk.service;

import com.sherlockkk.dao.UserDao;
import com.sherlockkk.domain.User;
import com.sherlockkk.serviceInterface.UserServiceInterface;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    @Resource
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User findUserById(String uid) {
        return userDao.findUserByUid(uid);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
