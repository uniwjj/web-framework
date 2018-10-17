package com.beidou.wfk.bean;

import lombok.Getter;
import lombok.ToString;

/**
 * 封装的表单参数
 *
 * @author ginger
 * @create 2018-10-17 17:18
 */
@Getter
@ToString
public class FormParam {
    /**
     * 字段名
     */
    private String fieldName;

    /**
     * 字段值
     */
    private Object fieldValue;

    public FormParam(String fieldName, Object fieldValue) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}