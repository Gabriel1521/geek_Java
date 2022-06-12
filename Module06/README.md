Module 06

6.（必做）基于电商交易场景（用户、商品、订单），设计一套简单的表结构，提交 DDL 的 SQL 文件到 Github（后面 2 周的作业依然要是用到这个表结构）。

![Pasted Graphic](https://user-images.githubusercontent.com/10376496/173229909-391c5f69-a749-41ef-832f-dc93a1af7435.jpg)


CREATE TABLE User
(
UserID int,
UserName varchar(255),
Password varchar(255),
NickName varchar(255),
ID varchar(255)
);

CREATE TABLE Product
(
ProductID int,
ProductName varchar(255),
Category varchar(255),
Weight float(32)
);

CREATE TABLE Order
(
UserID int,
ProductID int,
Amount float(32),
Status varchar(255)
);
