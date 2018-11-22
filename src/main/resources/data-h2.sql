INSERT INTO "user" (id, first_name, last_name, full_name, mobile, phone_number, email, job_title, department_name) VALUES (1, 'Juhan', 'Juurikas', 'Juhan Juurikas', '+3726789889', '+3726789889', 'juhan.juurikas@gmail.com', 'employee','test');
INSERT INTO "user" (id, first_name, last_name, full_name, mobile, phone_number, email, job_title, department_name) VALUES (2, 'Mare', 'Maasikas', 'Mare Maasikas', '+3726789886', '+3726789889', 'mare.maasikas@gmail.com', 'employee','test');
INSERT INTO "user" (id, first_name, last_name, full_name, mobile, phone_number, email, job_title, department_name) VALUES (3, 'Mare Anna', 'Maasikas', 'Mare Anna Maasikas', '+3726789886', '+3726789889', 'mare.maasikas@gmail.com', 'employee','test');
INSERT INTO "user" (id, first_name, last_name, full_name, mobile, phone_number, email, job_title, department_name) VALUES (4, 'Jüri', 'Juurikas', 'Jüri Juurikas', '+3726789889', '+3726789889', 'juhan.juurikas@gmail.com', 'employee','test');
INSERT INTO "user" (id, first_name, last_name, full_name, mobile, phone_number, email, job_title, department_name) VALUES (5, 'Martin', 'Juurikas', 'Martin Juurikas', '+3726789889', '+3726789889', 'juhan.juurikas@gmail.com', 'employee','test');
INSERT INTO "user" (id, first_name, last_name, full_name, mobile, phone_number, email, job_title, department_name) VALUES (6, 'Anne', 'Maasikas', 'Anne Maasikas', '+3726789886', '+3726789889', 'mare.maasikas@gmail.com', 'employee','test');
INSERT INTO "user" (id, first_name, last_name, full_name, mobile, phone_number, email, job_title, department_name) VALUES (7, 'Kristel', 'Maas', 'Kristel Maas', '+3726789886', '+3726789889', 'mare.maasikas@gmail.com', 'employee','test');
INSERT INTO "user" (id, first_name, last_name, full_name, mobile, phone_number, email, job_title, department_name) VALUES (8, 'Anton', 'Anton', 'Anton Anton', '+3726789889', '+3726789889', 'juhan.juurikas@gmail.com', 'employee','test');
INSERT INTO "user" (id, first_name, last_name, full_name, mobile, phone_number, email, job_title, department_name) VALUES (9, 'Martin', 'Soo', 'Martin Soo', '+3726789889', '+3726789889', 'juhan.juurikas@gmail.com', 'employee','test');
INSERT INTO "user" (id, first_name, last_name, full_name, mobile, phone_number, email, job_title, department_name) VALUES (10, 'Arvi', 'Saar', 'Arvi Saar', '+3726789886', '+3726789889', 'mare.maasikas@gmail.com', 'employee','test');
INSERT INTO "user" (id, first_name, last_name, full_name, mobile, phone_number, email, job_title, department_name) VALUES (11, 'Inga ', 'Mere', 'Imga Mere', '+3726789886', '+3726789889', 'mare.maasikas@gmail.com', 'employee','test');
INSERT INTO "user" (id, first_name, last_name, full_name, mobile, phone_number, email, job_title, department_name) VALUES (12, 'Jüri', 'Lind', 'Jüri Lind', '+3726789889', '+3726789889', 'juhan.juurikas@gmail.com', 'employee','test');


INSERT INTO director (id, job_title) VALUES (1, 'TOPManager_1');
INSERT INTO director (id, job_title) VALUES (2, 'TOPManager_2');

INSERT INTO manager (id, job_title) VALUES (1,'manager_1');
INSERT INTO manager (id, job_title) VALUES (2,'manager_2');
INSERT INTO manager (id, job_title) VALUES (3,'manager_3');
INSERT INTO manager (id, job_title) VALUES (4,'manager_4');

INSERT INTO employee (id, user_id, job_title, order_nr) VALUES (1, 1, 'employee',1);
INSERT INTO employee (id, user_id, job_title, order_nr) VALUES (2, 2, 'employee',1);
INSERT INTO employee (id, user_id, job_title, order_nr) VALUES (3, 3, 'employee',1);
INSERT INTO employee (id, user_id, job_title, order_nr) VALUES (4, 3, 'employee',2);
INSERT INTO employee (id, user_id, job_title, order_nr) VALUES (5, 11, 'employee',2);

INSERT INTO company (id, company_name) VALUES (1, 'Tallink');

INSERT INTO company_director (id, company_id, director_id) VALUES (1, 1, 1);
INSERT INTO company_director (id, company_id, director_id) VALUES (2, 1, 2);

INSERT INTO director_manager (id, director_id, manager_id) VALUES (1, 1, 1);
INSERT INTO director_manager (id, director_id, manager_id) VALUES (2, 2, 2);
INSERT INTO director_manager (id, director_id, manager_id) VALUES (3, 2, 3);
INSERT INTO director_manager (id, director_id, manager_id) VALUES (4, 1, 4);

INSERT INTO manager_employee (id, manager_id, employee_id) VALUES (1, 1, 1);
INSERT INTO manager_employee (id, manager_id, employee_id) VALUES (2, 2, 2);
INSERT INTO manager_employee (id, manager_id, employee_id) VALUES (3, 3, 3);
INSERT INTO manager_employee (id, manager_id, employee_id) VALUES (4, 2, 4);
INSERT INTO manager_employee (id, manager_id, employee_id) VALUES (5, 4, 5);










