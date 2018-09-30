package com.sherlockkk.dao;

import com.sherlockkk.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,String> {
    User findUserByUid(String uid);
}
