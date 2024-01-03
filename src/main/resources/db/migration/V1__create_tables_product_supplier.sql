create table supplier
(
    id         varchar(36)  not null primary key,
    `name`     varchar(100) not null,
    created_at datetime     not null,
    update_at  datetime
);

create table cayena.product
(
    id         varchar(36)  not null
        primary key,
    created_at datetime     not null,
    update_at  datetime,
    quantity   datetime     not null,
    name       varchar(100) not null,
    unit_price decimal      not null,
    supplier_id varchar(36)  not null,
    constraint product_supplier_id_fk
        foreign key (supplier_id) references supplier (id)
);


