package com.sherlockkk.service;

import com.sherlockkk.dao.AccountDao;
import com.sherlockkk.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
//@Transactional
public class AcountServiceTest {

    @Autowired
    private AcountService acountService;

    @Autowired
    private AccountDao accountDao;

    @Test
    public void inMoney() {
        acountService.inMoney("Tom", 300);
    }

    @Test
    public void outMoney() {
        acountService.outMoney("Jerry", 300);
    }

    @Test
    @Transactional
    public void transMoney() {
        acountService.transfer("Tom", "Jerry", 200);
    }

    @Test
    public void init() {
        Account tom = new Account();
        tom.setName("Tom");
        tom.setBalance(1000);
        accountDao.save(tom);

        Account jerry = new Account();
        jerry.setName("Jerry");
        jerry.setBalance(1000);
        accountDao.save(jerry);
    }
}