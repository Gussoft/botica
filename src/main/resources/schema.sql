create table farmacia.Address (
                                  id_address bigserial primary key not null,
                                  street varchar(100) null,
                                  city varchar(100) not null,
                                  state varchar(50)
);

create table farmacia.Employee (
                                   id_employee bigserial primary key not null,
                                   "name" varchar(40)not null,
                                   "document" varchar(11)not null,
                                   job varchar(40) not null,
                                   "age" varchar(2)null,
                                   phone varchar(12) not null,
                                   income TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                   address_id integer references farmacia.Address (id_address) ON DELETE cascade
);


create table farmacia.Users(
                               id_user bigserial primary key not null,
                               id_employee integer not null,
                               roles varchar(2)not null,
                               "name" varchar(30)not null,
                               "password" varchar(10) not null,
                               status varchar(2) not null
);