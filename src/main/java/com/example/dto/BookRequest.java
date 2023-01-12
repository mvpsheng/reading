package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FileName: BookRequest
 * author: gxs
 * Date: 2023/1/12  21:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 书名
     */
    private String bookName;
    /**
     * 简单描述
     */
    private String description;

    /**
     * 评价与感受
     */
    private String comment;

    /**
     * 书的图片
     */
    private byte[] icon;
}
