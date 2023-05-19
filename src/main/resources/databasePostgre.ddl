create schema if not exists slaughterhouse;
set schema 'slaughterhouse';


create domain type varchar not null check ( value in ('Wing', 'Leg', 'Breast', 'Neck'));
create domain weight numeric(4, 2) not null check ( value between 0.00 and 10.00);

create table animal
(
    regNum  serial primary key,
    regDate varchar(10),
    weight  weight,
    origin  varchar
);

create table animal_part
(
    id        serial primary key,
    animal_id int references animal (regNum),
    type      type,
    weight    weight
);


create table tray
(
    id         serial primary key,
    weight     weight,
    parts_type type
);


create table tray_contains
(
    tray_id int references tray (id),
    part_id int references animal_part (id),
    primary key (tray_id, part_id)
);


create table product
(
    id           serial primary key,
    product_type type
);

create table product_contains
(
    product_id int references product (id),
    tray_id    int references tray (id),
    primary key (product_id, tray_id)
);