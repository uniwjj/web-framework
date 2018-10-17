package com.beidou.jdk;

import com.beidou.common.Hello;
import com.beidou.common.HelloImpl;

import java.lang.reflect.Proxy;

/**
 * 主类
 *
 * @author ginger
 * @create 2018-10-17 20:54
 */
public class Main {
    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy(new HelloImpl());
        Hello helloProxy = jdkProxy.getProxy();
        helloProxy.say("Jack");
    }
}
