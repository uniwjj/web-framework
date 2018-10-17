package com.beidou.cglib;

import com.beidou.common.Hello;
import com.beidou.common.HelloImpl;

/**
 * 主类
 *
 * @author ginger
 * @create 2018-10-17 21:16
 */
public class Main {
    public static void main(String[] args) {
        Hello helloProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);
        helloProxy.say("Jack");
    }
}
