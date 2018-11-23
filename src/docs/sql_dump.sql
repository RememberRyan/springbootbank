create table user (
  id int auto_increment NOT NULL,
  name varchar(50) NOT NULL,
  surname varchar(50) NOT NULL,
  dob DATETIME default now() NOT NULL,
  nationality varchar(50) DEFAULT 'Estonia',
  account_num int(3) not null, #https://forums.mysql.com/read.php?10,477408,477408
  primary key (id)
);

create table accounts (
  id int NOT NULL,
  currency varchar(3) DEFAULT 'EUR', # https://www.ibm.com/support/knowledgecenter/en/SSZLC2_7.0.0/com.ibm.commerce.payments.developer.doc/refs/rpylerl2mst97.htm
  balance decimal(15,2) DEFAULT '0.00', # https://stackoverflow.com/a/13030389
  primary key (id), # https://stackoverflow.com/a/13645562
  foreign key (id) references user(id)
);

insert into user (
    name,
    surname,
    dob,
    nationality,
    account_num)
values ('Raquel',
        'Welch',
        '1968-04-10 00:40:00',
        'United States',
        '001'
        );


insert into user (
    name,
    surname,
    dob,
    nationality,
    account_num)
values ('Bob',
        'Dylan',
        '1967-04-10 00:40:00',
        'United States',
        '002'
        );


insert into user (
    name,
    surname,
    dob,
    nationality,
    account_num)
values ('Sean',
        'Connery',
        '1942-11-10 00:40:00',
        'United Kingdom',
        '003'
        );


insert into accounts (id, currency, balance) values ('001', 'USD', '100.00');
insert into accounts (id, currency, balance) values ('002', 'USD', '100.00');
insert into accounts (id, currency, balance) values ('003', 'GBP', '500.00');

-- last edited 23-Nov-2018

