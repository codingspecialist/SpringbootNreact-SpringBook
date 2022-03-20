CREATE DATABASE springdb;
CREATE user 'springuser'@'%' identified by 'springuser1234';
GRANT ALL PRIVILEGES ON springdb.* TO 'springuser'@'%';