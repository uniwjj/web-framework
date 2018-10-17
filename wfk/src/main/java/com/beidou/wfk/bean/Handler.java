package com.beidou.wfk.bean;

import lombok.Getter;
import lombok.ToString;
import java.lang.reflect.Method;

/**
 * 封装的Action信息
 *
 * @author ginger
 * @create 2018-10-17 17:19
 */
@Getter
@ToString
public class Handler {
    /**
     * Controller类
     */
    private Class<?> controllerClass;

    /**
     * Action方法
     */
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }
}