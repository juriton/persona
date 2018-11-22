--changeset juri:1
CREATE TABLE "user"
(
  id            SERIAL CONSTRAINT user_pkey PRIMARY KEY,
  first_name    VARCHAR(255),
  last_name     VARCHAR(255),
  full_name     VARCHAR(255),
  mobile        VARCHAR(255),
  phone_number  VARCHAR(255),
  email         VARCHAR(255),
  job_title     VARCHAR(255),
  department_name   VARCHAR(255),
  created_at    DATE,
  created_by    VARCHAR(255),
  modified_at   DATE,
  modified_by   VARCHAR(255)
);

--changeset juri:2
CREATE TABLE manager
(
  id            SERIAL CONSTRAINT manager_pkey PRIMARY KEY,
  director_id BIGINT NOT NULL,
  job_title   VARCHAR(255)
);

--changeset juri:3
CREATE TABLE employee
(
  id      SERIAL CONSTRAINT employee_pkey PRIMARY KEY,
  user_id BIGINT NOT NULL,
  manager_id BIGINT NOT NULL,
  job_title VARCHAR(255),
  order_nr BIGINT
);

--changeset juri:4
CREATE TABLE director
(
  id      SERIAL CONSTRAINT director_pkey PRIMARY KEY,
  manager_id BIGINT NOT NULL,
  job_title VARCHAR(255)
);

--changeset juri:5
CREATE TABLE company
(
  id      SERIAL CONSTRAINT company_pkey PRIMARY KEY,
  company_name varchar(255)
);

--changeset juri:6
CREATE TABLE company_director
(
  id      SERIAL CONSTRAINT company_director_pkey PRIMARY KEY,
  company_id BIGINT,
  director_id BIGINT
);

--changeset juri:7
CREATE TABLE director_manager
(
  id      SERIAL CONSTRAINT director_manager_pkey PRIMARY KEY,
  director_id BIGINT,
  manager_id BIGINT
);