CREATE TABLE USER (id INT PRIMARY KEY auto_increment,
                   username VARCHAR(50) NOT NULL UNIQUE,
                   password VARCHAR(20) NOT NULL
);

INSERT INTO USER(username, password) VALUES('admin', 'admin')
