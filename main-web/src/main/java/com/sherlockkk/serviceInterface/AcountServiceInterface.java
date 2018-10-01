package com.sherlockkk.serviceInterface;

public interface AcountServiceInterface {
    void inMoney(String name, double money);
    void outMoney(String name, double money);

    void transfer(String outName, String inName, double money);
}
