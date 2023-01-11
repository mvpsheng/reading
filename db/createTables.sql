# create database reading;
# use reading;
# create table if not exists reading.t_book
# (
#     id int(20) not null auto_increment comment '书id' primary key,
#     isDelete tinyint not null comment '逻辑删除',
#     bookName varchar(30) not null comment '书名',
#     bookShelfId int(20) null comment '书架id',
#     bookListId int(20) null comment '书单id',
#     userId int(20) not null comment '用户id',
#     icon blob null comment '书的图片',
#     description varchar(64) null comment '简单描述',
#     comment varchar(256) null comment '评价与感受'
# ) comment 'reading.t_book';
# create table if not exists reading.t_user
# (
#     id int(20) not null auto_increment comment '用户id' primary key,
#     userName varchar(32) not null comment '用户名',
#     password varchar(32) not null comment '用户密码'
# ) comment '用户表';
# desc reading.t_user;
# desc reading.t_book;