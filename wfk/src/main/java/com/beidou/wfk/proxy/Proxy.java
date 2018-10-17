package com.beidou.wfk.proxy;

/**
 * 代理接口
 *
 * @author ginger
 * @create 2018-10-17 19:10
 */
public interface Proxy {
    /**
     * 执行链式代理
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}