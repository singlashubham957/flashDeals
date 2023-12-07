CREATE TABLE users
(
    user_id  varchar not null,
    email_id varchar not null
);

CREATE TABLE deals
(
    id               varchar   not null,
    item_description varchar   not null,
    start_time       timestamp not null,
    end_time         timestamp not null,
    noOfItems        bigint    not null,
    owner_user_id    varchar   not null
);

CREATE TABLE orders
(
    id         varchar   not null,
    user_id    varchar   not null,
    deal_id    varchar   not null,
    created_at timestamp not null,
);