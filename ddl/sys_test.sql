create table sys_test(
     id   bigint auto_increment primary key,
     date timestamp null,
     text blob null
) comment '系统测试信息表';