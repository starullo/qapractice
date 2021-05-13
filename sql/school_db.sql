
USE school_db;


CREATE TABLE students (
id INT AUTO_INCREMENT,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
age INT NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE teachers (
id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE classes (
id INT NOT NULL AUTO_INCREMENT,
fk_teacher_id INT NOT NULL,
subject VARCHAR(50) NOT NULL,
description VARCHAR(100) NOT NULL,
level INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (fk_teacher_id) REFERENCES teachers(id)
);

CREATE TABLE enrollment (
id INT NOT NULL AUTO_INCREMENT,
fk_class_id INT NOT NULL,
fk_student_id INT NOT NULL,
fk_teacher_id INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (fk_class_id) REFERENCES classes(id),
FOREIGN KEY (fk_student_id) REFERENCES students(id),
FOREIGN KEY (fk_teacher_id) REFERENCES teachers(id)
);

INSERT INTO students
VALUES (NULL, 'Wanda', 'Person', 22);

INSERT INTO students
VALUES (NULL, 'Jake', 'Smith', 24);

INSERT INTO students
VALUES (NULL, 'Emily', 'Jones', 24);

INSERT INTO students
VALUES (NULL, 'Roger', 'Johnson', 25);

INSERT INTO teachers
VALUES (NULL, 'Mr. Smith'), 
(NULL, 'Mrs. Johnson'), 
(NULL, 'Professor Person');


INSERT INTO classes
VALUES (NULL, 1, 'Math', 'Learn Mathematics and more Math related topics', 1),
(NULL, 2, 'History 102', 'Learn the history of the world', 2),
(NULL, 3, 'Biology', 'Learn Biology and more scienc-y stuff', 2),
(NULL, 3, 'Advanced Chemistry', 'Learn advanced chemistry concepts', 3);

SELECT * FROM classes;
SELECT * FROM students;
SELECT * FROM teachers;

INSERT INTO enrollment
VALUES (NULL, 1, 1, 1),
(NULL, 3, 1, 3),
(NULL, 4, 1, 3),
(NULL, 2, 2, 2),
(NULL, 3, 2, 3),
(NULL, 3, 3, 3),
(NULL, 1, 3, 1),
(NULL, 4, 4, 3),
(NULL, 2, 4, 2);

SELECT * FROM enrollment;

SELECT subject FROM classes
JOIN enrollment ON enrollment.fk_student_id = 1
WHERE classes.id = enrollment.fk_class_id;

SELECT subject FROM classes
JOIN enrollment ON enrollment.fk_student_id = 2
WHERE classes.id = enrollment.fk_class_id;

SELECT subject FROM classes
JOIN enrollment ON enrollment.fk_student_id = 3
WHERE classes.id = enrollment.fk_class_id;

SELECT subject FROM classes
JOIN enrollment ON enrollment.fk_student_id = 4
WHERE classes.id = enrollment.fk_class_id;

SELECT subject FROM classes where fk_teacher_id = 1;

SELECT subject FROM classes where fk_teacher_id = 2;

SELECT subject FROM classes where fk_teacher_id = 3;

