# SQL-Front 5.1  (Build 4.16)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: localhost    Database: 480
# ------------------------------------------------------
# Server version 5.0.51b-community-nt-log

DROP DATABASE IF EXISTS `Ticketing_System`;
CREATE DATABASE `Ticketing_System` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `Ticketing_System`;

CREATE TABLE ACCOUNTS  

( 
Username 	VARCHAR(30)	    NOT NULL,

Password 	VARCHAR(30)	    NOT NULL,

Name        VARCHAR(30)	    NOT NULL,

Address		VARCHAR(30) 	NOT NULL,

CardNumber  VARCHAR(20) 	NOT NULL,
 

PRIMARY KEY (Name) );

CREATE TABLE TICKETS  

( 
TicketID 	VARCHAR(15)	    NOT NULL,

Email 	    VARCHAR(30)	    NOT NULL,

Theatre     VARCHAR(15)	    NOT NULL,

Movie		VARCHAR(30) 	NOT NULL,

ShowRoom    VARCHAR(15) 	NOT NULL,

ShowDate     DATE 	NOT NULL,

ShowTime    TIME 	NOT NULL,

SeatNumber    VARCHAR(2) 	NOT NULL,

PRIMARY KEY (TicketID) );

CREATE TABLE MOVIE  

( 
MovieID 	VARCHAR(15)	    NOT NULL,

Theatre 	VARCHAR(15)	    NOT NULL,

MovieName       VARCHAR(30)	    NOT NULL,

ShowRoom    VARCHAR(15) 	NOT NULL,

ShowDate     DATE 	NOT NULL,

ShowTime    TIME 	NOT NULL,

Seat   Char(2) 	NOT NULL,
 

PRIMARY KEY (MovieID) );
 

#
# Dumping data for table users
#

UNLOCK TABLES;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;