package com.beidou.wfk.proxy;

import com.beidou.wfk.annotation.Transaction;
import lombok.extern.slf4j.Slf4j;
import java.lang.reflect.Method;

/**
 * 事务代理
 *
 * @author ginger
 * @create 2018-10-17 19:12
 */
@Slf4j
public class TransactionProxy implements Proxy {
    private static final ThreadLocal<Boolean> FLAG_HOLDER = ThreadLocal.withInitial(() -> false);

    @Override
    public Object doProxy(ProxyChain proxyChain) throws Throwable {
        Object result;
        boolean flag = FLAG_HOLDER.get();
        Method method = proxyChain.getTargetMethod();
        if (!flag && method.isAnnotationPresent(Transaction.class)) {
            FLAG_HOLDER.set(true);
            try {
                DatabaseHelper.beginTransaction();
                log.debug("begin transaction");
                result = proxyChain.doProxyChain();
                DatabaseHelper.commitTransaction();
                log.debug("commit transaction");
            } catch (Exception e) {
                DatabaseHelper.rollbackTransaction();
                log.debug("rollback transaction");
                throw e;
            } finally {
                FLAG_HOLDER.remove();
            }
        } else {
            result = proxyChain.doProxyChain();
        }
        return result;
    }
}
