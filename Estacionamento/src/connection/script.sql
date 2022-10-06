/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  andre
 * Created: 06/10/2022
 */

create database if not exists estacionamento;
USE estacionamento;

Create Table vaga(
   idVaga  int NOT NULL auto_INCREMENT,
   numero  int NOT NULL,
   rua     varchar(100) NOT NULL,
   obliqua boolean NOT NULL,
   PRIMARY KEY (IdVaga));