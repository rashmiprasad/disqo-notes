 create table disqo.note (
    id BigSerial PRIMARY KEY,
    user_id  integer NOT NULL,
    title VARCHAR (50) UNIQUE NOT NULL,
    note VARCHAR (1000) ,
    created_date_time TIMESTAMP  default current_timestamp,
    updated_date_time TIMESTAMP  default current_timestamp
    )
