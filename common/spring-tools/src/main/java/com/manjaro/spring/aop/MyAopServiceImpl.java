package com.manjaro.spring.aop;

/**
 * created by iriwen on 2020/06/26.
 */
public class MyAopServiceImpl implements MyAopService {
    @Override
    public void method() {

        System.out.println("my method invoke !");
    }
}
