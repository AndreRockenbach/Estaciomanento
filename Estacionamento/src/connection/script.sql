create database if not exists estacionamento;
USE estacionamento;

Create Table vaga(
   idVaga  int NOT NULL auto_INCREMENT,
   numero  int NOT NULL,
   rua     varchar(100) NOT NULL,
   obliqua boolean NOT NULL,
   PRIMARY KEY (IdVaga));

Create Table motorista(

   idMotorista     int NOT NULL auto_INCREMENT,
   nomeCompleto    varchar(100) NOT NULL,
   genero          varchar(20) NOT NULL,
   rg              varchar(15) NOT NULL,
   cpf             varchar(15) NOT NULL,
   celular         varchar(10) NOT NULL,
   email           varchar(30) NOT NULL,
   senha           varchar(6) NOT NULL,
   PRIMARY KEY (idmotorista)); 
