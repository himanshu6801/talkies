/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Himanshu
 * Created: 11 Jul, 2018
 */


Actor(actorid,name,sex,dob,bio)

Movie_Actor_rel(movieid,actorid)

Movie(movieid,name,year,plot,poster)

Producer(producesid,name,sex,dob,bio)

select 


CREATE TABLE ACTOR(
   ACTORID serial PRIMARY KEY     NOT NULL ,
   NAME TEXT    NOT NULL,
   SEX CHAR(1),
   DOB DATE,
   BIO TEXT
   
);

INSERT INTO ACTOR (NAME,SEX,DOB,BIO) VALUES ('Paul','M','1994-02-07','HE IS A GOOD ACTOR');

CREATE TABLE PRODUCER(
   PRODUCERID serial PRIMARY KEY     NOT NULL ,
   NAME TEXT    NOT NULL,
   SEX CHAR(1),
   DOB DATE,
   BIO TEXT
   
);

INSERT INTO PRODUCER (NAME,SEX,DOB,BIO) VALUES ('KASHYAP','M','1987-07-25','HE IS A GOOD PRODUDCER');

CREATE TABLE MOVIE(
   MOVIEID serial PRIMARY KEY     NOT NULL ,
   NAME TEXT    NOT NULL,
   YEAR DATE NOT NULL,
   PLOT TEXT,
   PRODUCERID INT REFERENCES PRODUCER(PRODUCERID),
   POSTER BYTEA
   
);

ALTER TABLE MOVIE ALTER COLUMN POSTER TYPE text;

INSERT INTO MOVIE (NAME,YEAR,PLOT,PRODUCERID,POSTER) VALUES ('JANM','1987','SUSPENSE-THRILLER',2,bytea('H:\img\dunkirk.img'));

CREATE TABLE MOVIE_ACTOR_REL(
   MOVIEID INT,
   ACTORID INT,
   FOREIGN KEY(MOVIEID) REFERENCES MOVIE(MOVIEID),
    FOREIGN KEY(ACTORID) REFERENCES ACTOR(ACTORID),
   PRIMARY KEY(MOVIEID,ACTORID)
);

INSERT INTO MOVIE_ACTOR_REL (MOVIEID,ACTORID) VALUES (1,1);



SELECT M.NAME,M.YEAR,M.PLOT,P.NAME AS PRODUCER,M.POSTER FROM MOVIE M INNER JOIN PRODUCER P ON M.PRODUCERID=P.PRODUCERID ;

--------------------------


