package com.beidou.wfk.helper;

import com.beidou.wfk.annotation.Inject;
import com.beidou.wfk.util.ReflectionUtil;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.ArrayUtils;
import java.lang.reflect.Field;
import java.util.Map;

/**
 * IOC助手类
 *
 * @author ginger
 * @create 2018-10-17 19:41
 */
public final class IocHelper {
    static {
        // 获取所有的Bean及Bean和Class的映射关系
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (MapUtils.isNotEmpty(beanMap)) {
            // 对所有的Bean进行遍历，如果有Inject注解，则进行注入
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                // 获取Bean包含的所有成员变量
                Field[] beanFields = beanClass.getDeclaredFields();
                if (ArrayUtils.isNotEmpty(beanFields)) {
                    for (Field beanField : beanFields) {
                        // 如果Bean中的成员变量有Inject注解，则进行注入
                        if (beanField.isAnnotationPresent(Inject.class)) {
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if (beanFieldInstance != null) {
                                // 通过反射将值注入
                                ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
