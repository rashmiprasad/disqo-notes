 create table disqo.note (
    id serial PRIMARY KEY,
    user_id  integer NOT NULL,
    title VARCHAR (50) UNIQUE NOT NULL,
    note VARCHAR (1000) UNIQUE NOT NULL,
    created_date_time TIMESTAMP  default current_timestamp,
    updated_date_time TIMESTAMP  default current_timestamp
    );