Create table academic.students(

id serial primary key,
name varchar(50),
department varchar(50)


);

insert into academic.students(name,department)
values
('Ali khan ', 'Computer_Department'),
('Noor', 'Data_Science '),
('samee','Software Engr');

Select * from academic.students;


GRANT USAGE ON SCHEMA academic TO szabist_viewer;

GRANT SELECT ON academic.students TO szabist_viewer;


SELECT * FROM academic.students;


INSERT INTO academic.students (name, department) VALUES ('Hussain', 'BBA');

SELECT * FROM academic.students;

SET ROLE szabist_viewer;

SELECT * FROM academic.students;

INSERT INTO academic.students (name, department) VALUES ('Rajpar', 'BBA');

RESET ROLE;

SELECT current_user;

SET ROLE szabist_viewer;
-- to see the current user 
/* 

This is multi line comment
*/
SELECT current_user;

