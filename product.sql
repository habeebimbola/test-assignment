--Purpose: Database Schema Creation Script
--Author: ANIMASHAUN HABEEB ABIMBOLA

create database if not exists test_assignment;

use test_assignment;

 create table Product
 (
    ID int not null primary key auto_increment,
    NAME varchar(500),
    PRICE decimal(11,2),
    created_date timestamp not null default current_timestamp
 );