package com.beidou.wfk.bean;

import com.google.common.collect.Maps;
import lombok.Getter;
import lombok.ToString;
import java.util.Map;

/**
 * 返回的视图对象
 *
 * @author ginger
 * @create 2018-10-17 17:21
 */
@Getter
@ToString
public class View {
    /**
     * 视图路径
     */
    private String path;

    /**
     * 模型数据
     */
    private Map<String, Object> model;

    public View(String path) {
        this.path = path;
        model = Maps.newHashMap();
    }

    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }
}