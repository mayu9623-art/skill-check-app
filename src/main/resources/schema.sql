DROP TABLE IF EXISTS questions;

CREATE TABLE questions (
    id SERIAL PRIMARY KEY,
    question VARCHAR(255) NOT NULL,
    choice1 VARCHAR(100) NOT NULL,
    choice2 VARCHAR(100) NOT NULL,
    choice3 VARCHAR(100) NOT NULL,
    choice4 VARCHAR(100) NOT NULL,
    answer INT NOT NULL
);