create database one_arm_bandit;

use one_arm_bandit;

create table players (
playerId int not null auto_increment primary key,
playerName varchar(30) NOT NULL UNIQUE,
playerPoints int,
playerIfAdmin boolean NOT NULL,
password varchar(30) NOT NULL,
email varchar(30) NOT NULL UNIQUE);

CREATE TABLE bandits (
gameId int NOT NULL AUTO_INCREMENT PRIMARY KEY,
banditName VARCHAR(20) NOT NULL UNIQUE,
jackpot float8 NOT NULL
); 

CREATE TABLE stakes (
stakeId int NOT NULL AUTO_INCREMENT PRIMARY KEY,
stakeHeight int NOT NULL
);

CREATE TABLE symbols (
symbolId int NOT NULL AUTO_INCREMENT PRIMARY KEY,
symbolName VARCHAR(20) NOT NULL UNIQUE
);

CREATE TABLE prizes (
prizeId int NOT NULL AUTO_INCREMENT PRIMARY KEY,
prizeHeight VARCHAR(20) NOT NULL UNIQUE
);

create table banditsStakes (
banditsStakesId int NOT NULL auto_increment primary key,
gameId int NOT NULL,
stakeId int NOT NULL,
FOREIGN KEY (gameId) REFERENCES one_arm_bandit.bandits(gameId),
FOREIGN KEY (stakeId) REFERENCES one_arm_bandit.stakes(stakeId) );

create table banditsSymbols (
banditsSymbolsId int NOT NULL auto_increment primary key,
gameId int NOT NULL,
symbolId int NOT NULL,
FOREIGN KEY (gameId) REFERENCES bandits(gameId),
FOREIGN KEY (symbolId) REFERENCES symbols(symbolId) );

create table banditsPrizes (
banditsPrizesId int NOT NULL auto_increment primary key,
gameId int NOT NULL,
prizeId int NOT NULL,
FOREIGN KEY (gameId) REFERENCES bandits(gameId),
FOREIGN KEY (prizeId) REFERENCES prizes(prizeId) );