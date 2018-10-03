package com.sherlockkk.dao;

import com.sherlockkk.domain.Account;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AccountDao extends JpaRepository<Account, Integer> {

    Account findAccountByName(String name);

//    @Modifying
//    @Query("update Account a set a.balance=?2 where a.name=?1")
//    void inMoney(String name, double money);
//
//    @Modifying
//    @Query("update Account a set a.balance=?2 where a.name=?1")
//    void outMoney(String name, double money);

    @Modifying
    @Query("update Account a set a.balance = a.balance + 100 where a.name=?1")
    void inMoney(String name);

    @Modifying
    @Query("update Account a set a.balance= a.balance - 100 where a.name=?1")
    void outMoney(String name);

    @Modifying
    @Query("update Account a set a.balance=a.balance-100 where a.name=?1")
    void transferMoney(String name);
}
