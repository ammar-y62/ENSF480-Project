DROP DATABASE IF EXISTS TICKETING_SYSTEM;
CREATE DATABASE TICKETING_SYSTEM;
USE TICKETING_SYSTEM;

CREATE TABLE ACCOUNTS  

( 
Username 	VARCHAR(30)	    NOT NULL,

Password 	VARCHAR(30)	    NOT NULL,

Name        VARCHAR(30)	    NOT NULL,

Address		VARCHAR(30) 	NOT NULL,

CardNumber  VARCHAR(20) 	NOT NULL,
 

PRIMARY KEY (Name) );

INSERT INTO ACCOUNTS (Username, Password, Name, Address, CardNumber)
VALUES
("davidssss", "kim", "David", "my home", "132523135"),
("thevinss", "mahawatte", "Thevin", "your home", "2345135"),
("bennssss", "leggett", "Ben", "his home", "515124");

CREATE TABLE TICKETS  

( 
TicketID 	VARCHAR(15)	    NOT NULL,

Email 	    VARCHAR(30)	    NOT NULL,

Theatre     VARCHAR(15)	    NOT NULL,

Movie		VARCHAR(30) 	NOT NULL,

ShowRoom    VARCHAR(15) 	NOT NULL,

ShowDate     VARCHAR(8) 	NOT NULL,

ShowTime    VARCHAR(4) 	NOT NULL,

SeatNumber    VARCHAR(2) 	NOT NULL,

PRIMARY KEY (TicketID) );

CREATE TABLE MOVIE  

( 
MovieID 	VARCHAR(15)	    NOT NULL,

Theatre 	VARCHAR(15)	    NOT NULL,

MovieName       VARCHAR(30)	    NOT NULL,

ShowRoom    VARCHAR(15) 	NOT NULL,

ShowDate     VARCHAR(8) 	NOT NULL,

ShowTime    VARCHAR(4) 	NOT NULL,

Seat   Char(2) 	NOT NULL,
 

PRIMARY KEY (MovieID) );
 
INSERT INTO MOVIES (MovieID, Theatre, MovieName, ShowRoom, ShowDate, ShowTime, Seat)
VALUES
("fsfwewf", "Chinook", "Avatar", "14", "20221213", "2000", "60"),
("asfasf", "Market Mall", "Neymar", "13", "20221214", "2100", "50"),
("cadgasdf", "Ireland", "Lego", "12", "20221215", "2200", "40");