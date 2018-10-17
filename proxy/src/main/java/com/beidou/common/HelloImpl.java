package com.beidou.common;

/**
 * Hello实现类
 *
 * @author ginger
 * @create 2018-10-17 20:44
 */
public class HelloImpl implements Hello {
    @Override
    public void say(String name) {
        System.out.println("Hello! " + name);
    }
}
