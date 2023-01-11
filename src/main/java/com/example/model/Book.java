package com.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.Data;

/**
 * reading.t_book
 * @TableName t_book
 */
@TableName(value ="t_book")
@Data
public class Book implements Serializable {
    /**
     * 书id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 逻辑删除
     */
    private Integer isDelete;

    /**
     * 书名
     */
    private String bookName;

    /**
     * 书架id
     */
    private Integer bookShelfId;

    /**
     * 书单id
     */
    private Integer bookListId;

    /**
     * 用户id
     */
    private Integer userId;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}