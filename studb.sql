create database STUDB
go

use STUDB;
go

create table STUDENT_INFO
(
    stuno varchar(20) primary key,
    stuname varchar(50) not null,
    stuage int check (stuage >= 18),
    stusex char(2) check (stusex = '男' or stusex = '女'),
    stuscore decimal check (stuscore > 0 and stuscore <= 100),
    reg_time datetime default getdate()
);

-- 按照表来
insert into STUDENT_INFO values ('1', '张三', 22, '男', 77, '2020-01-01');
insert into STUDENT_INFO values ('2', '张三', 22, '男', 77, '2020-01-01');
insert into STUDENT_INFO values ('3', '张三', 22, '男', 77, '2020-01-01');
insert into STUDENT_INFO values ('4', '张三', 22, '男', 77, '2020-01-01');
insert into STUDENT_INFO values ('5', '张三', 22, '男', 77, '2020-01-01');
