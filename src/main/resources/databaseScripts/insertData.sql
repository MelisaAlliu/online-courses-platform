INSERT INTO course_category (category_name)
VALUES ('Web Development'),
       ('Mobile Development'),
       ('Data Science'),
       ('Cloud Computing'),
       ('Software Testing'),
       ('Project Management');

INSERT INTO course (course_title, course_content, category_id)
VALUES ('Introduction to HTML and CSS', 'HTML and CSS are the foundational technologies of web development.', 1),
       ('Introduction to Python', 'Python is a high-level programming language designed to be easy.', 3),
       ('Building Android Apps', 'This course teaches you how to build mobile applications for Android devices.', 2),
       ('JavaScript: From Zero to Hero', 'This course teaches you the basics of JavaScript and its practical applications.', 1),
       ('AWS Cloud Computing', 'AWS is a subsidiary of Amazon that provides on-demand cloud computing platforms.', 4);

INSERT INTO role (role_name)
VALUES ('Administrator');

INSERT INTO users (user_name, password, role_id)
VALUES ('admin', 'admin', 1);