package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.model.Book;
import com.example.service.BookService;
import com.example.mapper.BookMapper;
import org.springframework.stereotype.Service;

/**
* @author 27111
* @description 针对表【t_book(reading.t_book)】的数据库操作Service实现
* @createDate 2023-01-11 20:31:50
*/
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book>
    implements BookService{

}




