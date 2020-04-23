create table tbl_relation(id int primary key auto_increment, nodename varchar(50),
neighbournode varchar(50), created_date timestamp default current_timestamp, 
modified_date timestamp null);


create table tbl_msg(id int primary key auto_increment, sourcenode varchar(50), baseStation 
varchar(50), messege text, created_date timestamp default current_timestamp,
modified_date timestamp null); 