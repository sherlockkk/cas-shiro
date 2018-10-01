package com.sherlockkk.service;

import com.sherlockkk.dao.AccountDao;
import com.sherlockkk.domain.Account;
import com.sherlockkk.serviceInterface.AcountServiceInterface;
import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.RollbackException;


@Transactional
@Service
public class AcountService implements AcountServiceInterface {

    @Resource
    private AccountDao accountDao;

    @Override
    public void inMoney(String name, double money) {
        Account account = accountDao.findAccountByName(name);
        double balance = account.getBalance();
        double newMoney = balance + money;
        accountDao.inMoney(name, newMoney);
    }

    @Override
    public void outMoney(String name, double money) {
        Account account = accountDao.findAccountByName(name);
        double balance = account.getBalance();
        double newMoney = balance - money;
        accountDao.outMoney(name, newMoney);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void transfer(String outName, String inName, double money) {
        try{
            Account account = accountDao.findAccountByName(outName);
            double balance = account.getBalance();
            double newMoney = balance - money;
            accountDao.outMoney(outName, newMoney);

            int i = 0 / 0;

            Account account1 = accountDao.findAccountByName(inName);
            double balance1 = account1.getBalance();
            double newMoney1 = balance1 + money;
            accountDao.inMoney(inName, newMoney1);
        }catch (Exception e){
            e.printStackTrace();
        }


//        outMoney(outName, money);
//        int i = 0 / 0;
//        inMoney(inName, money);
    }


}


