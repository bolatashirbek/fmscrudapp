create table if not exists persons
(
    id bigint auto_increment primary key,
    first_name varchar(200),
    last_name varchar(200),
    patronymic varchar(200),
    iin    varchar(30) not null,
    region_id bigint
);

create table if not exists regions
(
	id bigint auto_increment primary key,
	name varchar(200) not null
);
