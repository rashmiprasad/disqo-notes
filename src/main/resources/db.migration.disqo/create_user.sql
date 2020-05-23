create table disqo.user (
    id BigSerial PRIMARY KEY,
    email VARCHAR (50) UNIQUE NOT NULL,
    password VARCHAR (50) NOT NULL,
    created_date_time TIMESTAMP  default current_timestamp,
    updated_date_time TIMESTAMP  default current_timestamp
    )
