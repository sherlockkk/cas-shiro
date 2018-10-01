package com.sherlockkk.utils;

import com.sherlockkk.service.AcountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

@Slf4j
public class TempUtil {
//    public static void main(String[] args) {
//        log.debug("--------------debug");
//        log.info("--------------info");
//        log.warn("-----------warn");
//        log.error("----------error");
//        log.trace("----------trace");
//    }


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AcountService acountService = (AcountService) applicationContext.getBean("acountService");
        acountService.transfer("Tom", "Jerry", 100);

    }
}
