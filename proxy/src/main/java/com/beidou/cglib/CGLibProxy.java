package com.beidou.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLib代理
 *
 * @author ginger
 * @create 2018-10-17 21:10
 */
public class CGLibProxy implements MethodInterceptor {

    private static CGLibProxy instance = new CGLibProxy();

    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> clazz) {
        return (T) Enhancer.create(clazz, this);
    }


    public static CGLibProxy getInstance() {
        return instance;
    }


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before();
        Object ret = proxy.invokeSuper(obj, args);
        after();
        return ret;
    }


    private void before() {
        System.out.println("Before");
    }


    private void after() {
        System.out.println("After");
    }
}
