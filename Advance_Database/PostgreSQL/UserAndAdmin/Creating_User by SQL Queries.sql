CREATE SCHEMA academic_schema1;

CREATE TABLE academic_schema1.students (
    id serial primary key,
    name varchar(50),
    department varchar(50)
);

INSERT INTO academic_schema1.students (name, department)
VALUES
('Ali khan ', 'Computer_Department'),
('Noor', 'Data_Science '),
('samee','Software Engr');

SELECT * FROM academic_schema1.students;


CREATE USER szabist_viewer1 WITH LOGIN PASSWORD 'mypass123';


GRANT USAGE ON SCHEMA academic_schema1 TO szabist_viewer1;

--GRANT SELECT ON ALL TABLES IN SCHEMA academic_schema1 TO szabist_viewer1;

GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA academic_schema1 TO szabist_viewer1;

-- If the admin other tables then automatically this is how we can assign priviliges 

--ALTER DEFAULT PRIVILEGES IN SCHEMA academic_schema1 
--GRANT SELECT, INSERT ON TABLES TO szabist_viewer1;


SELECT current_user;

SET ROLE szabist_viewer1;

SELECT current_user;

SELECT * FROM academic_schema1.students;



INSERT INTO academic_schema1.students (name, department) 
VALUES ('Testt Student', 'Testing');


UPDATE academic_schema1.students 
SET department = 'Artificial Intelligence' 
WHERE name = 'Noor';

RESET ROLE;










