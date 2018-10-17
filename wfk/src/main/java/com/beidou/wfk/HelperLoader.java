package com.beidou.wfk;

import com.beidou.wfk.helper.*;
import com.beidou.wfk.util.ClassUtil;

/**
 * 加载相应的类
 *
 * @author ginger
 * @create 2018-10-17 19:28
 */
public final class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}
