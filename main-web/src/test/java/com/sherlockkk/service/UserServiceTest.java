package com.sherlockkk.service;

import com.sherlockkk.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void test_save() {
        User user = new User();
        user.setUsername("张三丰");
        user.setPassword("123456");
        userService.save(user);
    }

    @Test
    public void test_findUserById(){
        User user = userService.findUserById("40288042662aba8e01662aba98940000");
        log.info(user.getUsername());
        System.err.println(user.getUsername());
    }

    @Test
    public void test_findAll(){
        List<User> users = userService.findAll();
        users.forEach(user -> log.info(user.getUid()));
        users.forEach(user -> System.err.println(user.getUid()));
    }

}