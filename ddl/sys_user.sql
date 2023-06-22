create table sys_user(
    id       bigint auto_increment,
    name     varchar(32) null,
    password varchar(128) null,
    account  varchar(32) not null,
    birthday timestamp null,
    age      int null,
    gender   varchar(3) null,
    phone    varchar(11) null,
    degree   bigint null,
    constraint sys_user_pk primary key (id)
) comment '系统用户基本信息表';