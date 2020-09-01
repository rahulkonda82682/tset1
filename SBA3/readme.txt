
create table students(
studId int primary key,
studName varchar(20),
sem int);


insert into students values(1,'rahul',1);
insert into students values(2,'rohith',1);
insert into students values(3,'ramesh',1);
insert into students values(4,'dhoni',1);
insert into students values(5,'kuldeep',1);
insert into students values(6,'manoj',2);
insert into students values(7,'Abd',2);
insert into students values(8,'chahal',2);
insert into students values(9,'umesh',2);
insert into students values(10,'finch',2);
insert into students values(11,'dhoni',3);
insert into students values(12,'raina',3);
insert into students values(13,'jadeja',3);
insert into students values(14,'avinash',3);
insert into students values(15,'ajay',3);
insert into students values(16,'jadeja',4);
insert into students values(17,'raina',4);
insert into students values(18,'raju',4);
insert into students values(19,'ramu',4);
insert into students values(20,'john',4);
insert into students values(21,'dravid',5);
insert into students values(22,'sachin',5);
insert into students values(23,'nithin',5);
insert into students values(24,'deepak',5);
insert into students values(25,'raj',5);



create table attendance(
studId int,
studName varchar(20),
sem int,
AttendanceDate date,
AttendanceStatus varchar(6));



