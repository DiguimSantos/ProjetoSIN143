-- MySQL Script generated by MySQL Workbench
-- Ter 07 Jun 2016 20:45:34 BRT
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema dbevento
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dbevento
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbevento` DEFAULT CHARACTER SET utf8 ;
USE `dbevento` ;

-- -----------------------------------------------------
-- Table `dbevento`.`Evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbevento`.`Evento` (
  `idEvento` INT NOT NULL AUTO_INCREMENT,
  `nomeEvento` VARCHAR(30) NULL,
  `localEvento` VARCHAR(45) NULL,
  `dataEvento` TIMESTAMP NULL,
  PRIMARY KEY (`idEvento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbevento`.`Ingresso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbevento`.`Ingresso` (
  `idIngresso` INT NOT NULL AUTO_INCREMENT,
  `idEvento` INT NOT NULL,
  `quantidade` INT NULL,
  `preco` VARCHAR(45) NULL,
  PRIMARY KEY (`idIngresso`),
  INDEX `idEvento_idx` (`idEvento` ASC),
  CONSTRAINT `idEvento`
    FOREIGN KEY (`idEvento`)
    REFERENCES `dbevento`.`Evento` (`idEvento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbevento`.`Morador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbevento`.`Morador` (
  `idMorador` INT NOT NULL AUTO_INCREMENT,
  `cpf` INT NOT NULL,
  `email` VARCHAR(30) NOT NULL,
  `nome` VARCHAR(45) NULL,
  `login` VARCHAR(45) NULL,
  `senha` VARCHAR(20) NULL,
  `telefone` VARCHAR(14) NULL,
  `gerente` TINYINT(1) NULL,
  PRIMARY KEY (`idMorador`, `cpf`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbevento`.`Visitante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbevento`.`Visitante` (
  `idVisitante` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `cpf` INT NOT NULL,
  `endereco` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  `cidade` VARCHAR(45) NULL,
  `login` VARCHAR(45) NULL,
  `senha` VARCHAR(20) NULL,
  `Morador_cpf` INT NOT NULL,
  PRIMARY KEY (`idVisitante`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC),
  INDEX `fk_Visitante_Morador1_idx` (`Morador_cpf` ASC),
  CONSTRAINT `fk_Visitante_Morador1`
    FOREIGN KEY (`Morador_cpf`)
    REFERENCES `dbevento`.`Morador` (`cpf`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
