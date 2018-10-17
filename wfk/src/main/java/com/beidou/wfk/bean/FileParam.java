package com.beidou.wfk.bean;

import lombok.Getter;
import lombok.ToString;
import java.io.InputStream;

/**
 * 上传文件参数
 *
 * @author ginger
 * @create 2018-10-17 17:16
 */
@Getter
@ToString
public class FileParam {
    /**
     * 字段名
     */
    private String fieldName;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件大小
     */
    private Long fileSize;

    /**
     * 类型
     */
    private String contentType;

    /**
     * 输入流
     */
    private InputStream inputStream;

    public FileParam(String fieldName, String fileName, Long fileSize, String contentType, InputStream inputStream) {
        this.fieldName = fieldName;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.contentType = contentType;
        this.inputStream = inputStream;
    }
}

