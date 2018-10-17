package com.beidou.wfk.annotation;

import java.lang.annotation.*;

/**
 * 切面注解
 *
 * @author ginger
 * @create 2018-10-17 17:40
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    /**
     * 注解
     */
    Class<? extends Annotation> value();
}
