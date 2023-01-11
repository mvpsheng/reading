package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.model.User;
import com.example.service.UserService;
import com.example.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 27111
* @description 针对表【t_user(用户表)】的数据库操作Service实现
* @createDate 2023-01-11 20:33:28
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




