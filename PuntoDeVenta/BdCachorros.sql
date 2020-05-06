-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema cachorrosZapateria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema cachorrosZapateria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cachorrosZapateria` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `cachorrosZapateria` ;

-- -----------------------------------------------------
-- Table `cachorrosZapateria`.`calzado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cachorrosZapateria`.`calzado` (
  `codigo` INT(5) AUTO_INCREMENT ,
  `categoria` VARCHAR(50) NOT NULL,
  `marca` VARCHAR(50) NOT NULL,
  `modelo` VARCHAR(50) NOT NULL,
  `color` VARCHAR(50) NOT NULL,
  `numero` FLOAT NOT NULL,
  `precio` FLOAT NOT NULL,
  `fechaRegInv` VARCHAR(30) NOT NULL,
  `status` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`codigo`));


-- -----------------------------------------------------
-- Table `cachorrosZapateria`.`trabajador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cachorrosZapateria`.`trabajador` (
  `idTrabajador` VARCHAR(6) NOT NULL,
  `nomCompleto` VARCHAR(50) NOT NULL,
  `cargo` VARCHAR(25) NOT NULL,
  `direccion` VARCHAR(50) NOT NULL,
  `edad` INT(2) NOT NULL,
  PRIMARY KEY (`idTrabajador`));


-- -----------------------------------------------------
-- Table `cachorrosZapateria`.`checkentrada`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cachorrosZapateria`.`checkentrada` (
  `idcheck` INT(11) NOT NULL AUTO_INCREMENT,
  `idTrabajador` VARCHAR(6) NOT NULL,
  `hora` VARCHAR(15) NOT NULL,
  `fecha` VARCHAR(15) NOT NULL,
  `retardos` INT(11) NULL DEFAULT '0',
  PRIMARY KEY (`idcheck`),
  INDEX `idTrabajador` (`idTrabajador` ASC),
  CONSTRAINT `checkentrada_ibfk_1`
    FOREIGN KEY (`idTrabajador`)
    REFERENCES `cachorrosZapateria`.`trabajador` (`idTrabajador`));


-- -----------------------------------------------------
-- Table `cachorrosZapateria`.`checksalida`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cachorrosZapateria`.`checksalida` (
  `idchecksalida` INT(11) NOT NULL AUTO_INCREMENT,
  `idTrabajador` VARCHAR(6) NOT NULL,
  `hora` VARCHAR(15) NULL DEFAULT NULL,
  `fecha` VARCHAR(15) NULL DEFAULT NULL,
  PRIMARY KEY (`idchecksalida`),
  INDEX `idTrabajador` (`idTrabajador` ASC),
  CONSTRAINT `checksalida_ibfk_1`
    FOREIGN KEY (`idTrabajador`)
    REFERENCES `cachorrosZapateria`.`trabajador` (`idTrabajador`));


-- -----------------------------------------------------
-- Table `cachorrosZapateria`.`venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cachorrosZapateria`.`venta` (
  `idventa` INT(11) NOT NULL AUTO_INCREMENT,
  `idTrabajador` VARCHAR(6) NOT NULL,
  `codigo` INT(5) NOT NULL,
  `fechaVenta` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`idventa`),
  INDEX `codigo` (`codigo` ASC),
  CONSTRAINT `venta_ibfk_1`
    FOREIGN KEY (`codigo`)
    REFERENCES `cachorrosZapateria`.`calzado` (`codigo`));


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Insert `cachorrosZapateria`.`Calzado`
-- -----------------------------------------------------

    insert into calzado values(0,'Niña', 'Sweet', '416', 'Plata-Lila', 12, 310, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Sweet', '416', 'Plata-Lila', 12.5, 310, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Maria Mia', '600', 'Rosa', 12.5, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Maria Mia', '600', 'Rosa', 13, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Acuarelas', '888', 'Oro-Rosa', 13, 295, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Acuarelas', '888', 'Oro-Rosa', 13.5, 295, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Acuarelas', '888', 'Oro-Rosa', 14, 295, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Lorena Yedra', 'Unicornio', 'Espejo-Rosa-Pastel', 12, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Lorena Yedra', 'Unicornio', 'Espejo-Rosa-Pastel', 13, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Lorena Yedra', 'Unicornio', 'Espejo-Rosa-Pastel', 13.5, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Lorena Yedra', 'Unicornio', 'Espejo-Rosa-Pastel', 14, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Lorena Yedra', 'Unicornio', 'Espejo-Rosa-Pastel', 14.5, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Acuarelas', '889', 'Pique-Oro', 13, 295, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Acuarelas', '889', 'Pique-Oro', 13.5, 295, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Acuarelas', '889', 'Pique-Oro', 14.5, 295, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Acuarelas', '889', 'Pique-Plata', 13, 295, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Acuarelas', '889', 'Pique-Plata', 14, 295, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Vane', '702', 'Oro', 15.5, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Vane', '702', 'Oro-Rosa', 15, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Vane', '702', 'Oro-Rosa', 15.5, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Daniela', '0721', 'Rosa-Unicornio', 15, 295, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Daniela', '0721', 'Rosa-Unicornio', 15.5, 295, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Cecy', '020', 'Rosa-Fiusha', 15, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Cecy', '020', 'Rosa-Fiusha', 15.5, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Cecy', '020', 'Rosa-Fiusha', 17, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Nice', '600', 'Oro-Rosa', 20, 295, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Nice', '600', 'Oro-Rosa', 20.5, 295, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Impredecible', '100', 'Oro', 20, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Impredecible', '100', 'Oro', 20.5, 215, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Daniel´s', '15030', 'Azul-Arcoiris', 19.5, 295, '2019-01-17', '');
    insert into calzado values(0,'Niña', 'Daniel´s', '15030', 'Azul-Arcoiris', 20.5, 295, '2019-01-17', '');

    insert into calzado values(0, 'Futbol-Chico', 'Halcon', '507', 'Negro-Blanco', 22, 285, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Halcon', '507', 'Negro-Blanco', 23, 285, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Halcon', '507', 'Negro-Blanco', 24, 285, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Halcon', '507', 'Negro-Blanco', 24.5, 285, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Halcon', '507', 'Negro-Blanco', 25, 285, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '2075', 'Rey-Negro', 23, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '2075', 'Rey-Negro', 23.5, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '2075', 'Rey-Negro', 24, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '2075', 'Rey-Negro', 24.5, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '2074', 'Blanco-Gris', 24, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '2074', 'Blanco-Gris', 24.5, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '2074', 'Blanco-Gris', 25, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '2068', 'Fiusha-Neon', 23, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '2068', 'Fiusha-Neon', 23.5, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '2068', 'Fiusha-Neon', 24.5, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '2068', 'Fiusha-Neon', 25, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '035', 'Rojo-Neon', 24.5, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '035', 'Rojo-Neon', 25, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '047', 'Marino-Cielo', 24, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '047', 'Marino-Cielo', 24.5, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '047', 'Marino-Cielo', 25, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike-Bota', '043', 'Marino-Cielo', 24, 285, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike-Bota', '043', 'Marino-Cielo', 24.5, 285, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike-Bota', '042', 'Negro-Menta', 24.5, 285, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike-Bota', '042', 'Negro-Menta', 25, 285, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '044', 'Menta-Oxford', 22.5, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '044', 'Menta-Oxford', 24, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '044', 'Menta-Oxford', 24.5, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Nike', '044', 'Menta-Oxford', 25, 265, '2019-01-17', '');
    insert into calzado values(0, 'Futbol-Chico', 'Adidas', '042', 'Negro-Rey', 25, 265, '2019-01-17', '');

    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '699', 'Buck-Casper-Negro', 22.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '699', 'Buck-Casper-Negro', 23, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '699', 'Buck-Casper-Negro', 23.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '699', 'Buck-Casper-Negro', 24, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '699', 'Buck-Casper-Negro', 24.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '699', 'Buck-Casper-Negro', 25, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '699', 'Buck-Casper-Negro', 25.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '675', 'Dyor-Espejo-Burgundy-Plata', 22, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '675', 'Dyor-Espejo-Burgundy-Plata', 22.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '675', 'Dyor-Espejo-Burgundy-Plata', 24, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '675', 'Dyor-Espejo-Burgundy-Plata', 24.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '675', 'Dyor-Espejo-Burgundy-Plata', 25, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '675', 'Dyor-Espejo-Burgundy-Plata', 25.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '691', 'Toronto-Plata', 23.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '691', 'Toronto-Plata', 24, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '691', 'Toronto-Plata', 24.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '691', 'Toronto-Plata', 25, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '691', 'Toronto-Plata', 25.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '691', 'Negro', 22.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '691', 'Negro', 23, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '691', 'Negro', 23.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '691', 'Negro', 24, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '691', 'Negro', 24.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '691', 'Negro', 25, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Ivanna Rozzeti', '691', 'Negro', 25.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Saetta', '3600', 'Rojo-Blanco', 23.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Saetta', '3600', 'Rojo-Blanco', 24.5, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Saetta', '3600', 'Rojo-Blanco', 25, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Saetta', '3601', 'Rosa', 24, 275, '2019-01-17','');
    insert into calzado values(0, 'Dama', 'Saetta', '3601', 'Rosa', 24.5, 275, '2019-01-17','');
    
    insert into calzado values(0, 'Teni-Caballero', 'Vans', '116', 'Monocromo', 27, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Vans', '116', 'Monocromo', 27.5, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Vans', '116', 'Monocromo', 28, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Vans', '116', 'Monocromo', 28.5, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Vans', '116', 'Vino-Total', 25, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Vans', '116', 'Vino-Total', 25.5, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Vans', '116', 'Vino-Total', 26, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Vans', '116', 'Blanco-Total', 27, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Vans', '116', 'Blanco-Total', 27.5, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Vans', '116', 'Blanco-Total', 28, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Nike', 'F3', 'Blanco-Vino-Plata', 26, 285, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Nike', 'F3', 'Blanco-Vino-Plata', 26.5, 285, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Nike', 'F3', 'Blanco-Vino-Plata', 27, 285, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Nike', 'F3', 'Blanco-Vino-Plata', 27.5, 285, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Nike', 'F3', 'Blanco-Vino-Plata', 28.5, 285, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Adidas', '010', 'Negro-Negro', 25, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Adidas', '010', 'Negro-Negro', 26, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Adidas', '010', 'Negro-Negro', 27, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Adidas', '010', 'Negro-Negro', 27.5, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Adidas', '010', 'Negro-Negro', 28.5, 265, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Jordan', 'Ph01-Durazno', 'Negro-Blanco', 25, 365, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Jordan', 'Ph01-Durazno', 'Negro-Blanco', 26, 365, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Jordan', 'Ph01-Durazno', 'Negro-Blanco', 26.5, 365, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Jordan', 'Ph01-Durazno', 'Negro-Blanco', 27, 365, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Jordan', 'Ph01-Durazno', 'Negro-Blanco', 27.5, 365, '2019-01-25','');  
    insert into calzado values(0, 'Teni-Caballero', 'Converse', '600', 'Blanco', 25, 295, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Converse', '600', 'Blanco', 25.5, 295, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Converse', '600', 'Blanco', 26.5, 295, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Converse', '600', 'Blanco', 27.5, 295, '2019-01-25','');
    insert into calzado values(0, 'Teni-Caballero', 'Converse', '600', 'Blanco', 28.5, 295, '2019-01-25','');
    
    insert into calzado values(0, 'Teni-Dama', 'Nike', '353', 'Gris-Rosa', 22, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '353', 'Gris-Rosa', 22.5, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '353', 'Gris-Rosa', 23.5, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '353', 'Gris-Rosa', 24, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '353', 'Gris-Rosa', 24.5, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '353', 'Gris-Rosa', 25, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '405', 'Rosa-Gris', 22.5, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '405', 'Rosa-Gris', 23, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '405', 'Rosa-Gris', 23.5, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '405', 'Rosa-Gris', 24, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '405', 'Rosa-Gris', 24.5, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '405', 'Rosa-Gris', 25.5, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '074', 'Negro-Turqueza', 23, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '074', 'Negro-Turqueza', 24.5, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '074', 'Negro-Turqueza', 25, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '074', 'Negro-Turqueza', 25.5, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '074', 'Negro-Turqueza', 26, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Nike', '074', 'Negro-Turqueza', 26.5, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Adidas', '747', 'Minuet-Blanco', 23, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Adidas', '747', 'Minuet-Blanco', 24, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Adidas', '747', 'Minuet-Blanco', 24.5, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Adidas', '747', 'Minuet-Blanco', 25, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Adidas', '747', 'Minuet-Blanco', 25.5, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Adidas', '747', 'Minuet-Blanco', 26, 275, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Puma', '2080-Textil', 'Negro-Total', 23, 285, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Puma', '2080-Textil', 'Negro-Total', 23.5, 285, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Puma', '2080-Textil', 'Negro-Total', 24, 285, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Puma', '2080-Textil', 'Negro-Total', 24.5, 285, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Puma', '2080-Textil', 'Negro-Total', 25, 285, '2019-03-28','');
    insert into calzado values(0, 'Teni-Dama', 'Puma', '2080-Textil', 'Negro-Total', 26, 285, '2019-03-28','');

    insert into calzado values(0, 'Futbol-Grande', 'Nike', '2075', 'Rey-Negro', 26, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Nike', '2075', 'Rey-Negro', 26.5, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Nike', '2075', 'Rey-Negro', 27, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Nike', '2075', 'Rey-Negro', 27.5, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Nike', '2075', 'Rey-Negro', 28, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Adidas', '010', 'Negro-Rey', 26, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Adidas', '010', 'Negro-Rey', 26.5, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Adidas', '010', 'Negro-Rey', 27, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Adidas', '010', 'Negro-Rey', 27.5, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Adidas', '010', 'Negro-Rey', 28, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Frakos', '918', 'Blanco-Marino', 26, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Frakos', '918', 'Blanco-Marino', 26.5, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Frakos', '918', 'Blanco-Marino', 27, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Frakos', '918', 'Blanco-Marino', 27.5, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Frakos', '918', 'Blanco-Marino', 28, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Rebook', '3300', 'Marino', 26, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Rebook', '3300', 'Marino', 26.5, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Rebook', '3300', 'Marino', 27, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Rebook', '3300', 'Marino', 27.5, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Rebook', '3300', 'Marino', 28, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Adidas', '042', 'Blanco-Rojo', 26, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Adidas', '042', 'Blanco-Rojo', 26.5, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Adidas', '042', 'Blanco-Rojo', 27, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Adidas', '042', 'Blanco-Rojo', 27.5, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Adidas', '042', 'Blanco-Rojo', 28, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Trucco', 'Aguila-01', 'Azul-Naranja', 26, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Trucco', 'Aguila-01', 'Azul-Naranja', 26.5, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Trucco', 'Aguila-01', 'Azul-Naranja', 27, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Trucco', 'Aguila-01', 'Azul-Naranja', 27.5, 285, '2019-01-28','');
    insert into calzado values(0, 'Futbol-Grande', 'Trucco', 'Aguila-01', 'Azul-Naranja', 28, 285, '2019-01-28','');
   
    insert into calzado values(0, 'Sandalia', 'Sport', '608', 'Azul', 24, 55, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Sport', '608', 'Azul', 25, 55, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Sport', '608', 'Azul', 26, 55, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Sport', '608', 'Azul', 27, 55, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Sport', '608', 'Azul', 28, 55, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Chicote', '042', 'Cafe', 24, 75, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Chicote', '042', 'Cafe', 25, 75, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Chicote', '042', 'Cafe', 26, 75, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Chicote', '042', 'Cafe', 27, 75, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Chicote', '042', 'Cafe', 28, 75, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Tiger', '306', 'Negro', 24, 75, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Tiger', '306', 'Negro', 25, 75, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Tiger', '306', 'Negro', 26, 75, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Tiger', '306', 'Negro', 27, 75, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Tiger', '306', 'Negro', 28, 75, '2019-02-03','');
    insert into calzado values(0, 'Sandalia', 'Davicho', '680', 'Chocolate', 23, 195, '2019-03-08','');
    insert into calzado values(0, 'Sandalia', 'Davicho', '680', 'Chocolate', 23.5, 195, '2019-03-08','');
    insert into calzado values(0, 'Sandalia', 'Davicho', '680', 'Chocolate', 24, 195, '2019-03-08','');
    insert into calzado values(0, 'Sandalia', 'Davicho', '680', 'Chocolate', 24.5, 195, '2019-03-08','');
    insert into calzado values(0, 'Sandalia', 'Davicho', '680', 'Chocolate', 25, 195, '2019-03-08','');
    insert into calzado values(0, 'Sandalia', 'Bethis', '1000', 'Beige', 23, 195, '2019-03-08','');
    insert into calzado values(0, 'Sandalia', 'Bethis', '1000', 'Beige', 23.5, 195, '2019-03-08','');
    insert into calzado values(0, 'Sandalia', 'Bethis', '1000', 'Beige', 24, 195, '2019-03-08','');
    insert into calzado values(0, 'Sandalia', 'Bethis', '1000', 'Beige', 24.5, 195, '2019-03-08','');
    insert into calzado values(0, 'Sandalia', 'Bethis', '1000', 'Beige', 25, 195, '2019-03-08','');
    insert into calzado values(0, 'Sandalia', 'Torsal', '100', 'Cafe', 23, 195, '2019-03-08','');
    insert into calzado values(0, 'Sandalia', 'Torsal', '100', 'Cafe', 23.5, 195, '2019-03-08','');
    insert into calzado values(0, 'Sandalia', 'Torsal', '100', 'Cafe', 24, 195, '2019-03-08','');
    insert into calzado values(0, 'Sandalia', 'Torsal', '100', 'Cafe', 24.5, 195, '2019-03-08','');
    insert into calzado values(0, 'Sandalia', 'Torsal', '100', 'Cafe', 25, 195, '2019-03-08','');

    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Verde', 24, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Verde', 25, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Verde', 26, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Verde', 27, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Verde', 28, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Azul', 24, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Azul', 25, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Azul', 26, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Azul', 27, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Azul', 28, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Total', 24, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Total', 25, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Total', 26, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Total', 27, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-100', 'Negro-Total', 28, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Total', 24, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Total', 25, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Total', 26, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Total', 27, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Total', 28, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Azul', 24, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Azul', 25, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Azul', 26, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Azul', 27, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Azul', 28, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Verde', 24, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Verde', 25, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Verde', 26, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Verde', 27, 25, '2019-02-08','');
    insert into calzado values(0, 'Chancla-Economica', 'Economica', 'Eco-800', 'Negro-Verde', 28, 25, '2019-02-08','');


    insert into calzado values(0, 'Zapatilla', 'Vianny', '103', 'Piel-Negro', 23.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Vianny', '103', 'Piel-Negro', 24, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Vianny', '103', 'Piel-Negro', 24.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Vianny', '103', 'Piel-Negro', 25, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Vianny', '103', 'Piel-Negro', 25.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Vianny', '202', 'Rosa-Shell', 23.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Vianny', '202', 'Rosa-Shell', 24, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Vianny', '202', 'Rosa-Shell', 24.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Vianny', '202', 'Rosa-Shell', 25, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Vianny', '202', 'Rosa-Shell', 25.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Ozono', '200', 'Cobra-Negro', 23.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Ozono', '200', 'Cobra-Negro', 24, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Ozono', '200', 'Cobra-Negro', 24.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Ozono', '200', 'Cobra-Negro', 25, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Ozono', '200', 'Cobra-Negro', 25.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Ozono', '900', 'Charol-Maquillaje', 23.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Ozono', '900', 'Charol-Maquillaje', 24, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Ozono', '900', 'Charol-Maquillaje', 24.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Ozono', '900', 'Charol-Maquillaje', 25, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Ozono', '900', 'Charol-Maquillaje', 25.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Danna', 'Dan-72', 'Gamuza-Azul', 23.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Danna', 'Dan-72', 'Gamuza-Azul', 24, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Danna', 'Dan-72', 'Gamuza-Azul', 24.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Danna', 'Dan-72', 'Gamuza-Azul', 25, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Danna', 'Dan-72', 'Gamuza-Azul', 25.5, 285, '2019-01-17',''); 
    insert into calzado values(0, 'Zapatilla', 'Danna', 'Dan-123', 'Rojo', 23.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Danna', 'Dan-123', 'Rojo', 24, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Danna', 'Dan-123', 'Rojo', 24.5, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Danna', 'Dan-123', 'Rojo', 25, 285, '2019-01-17','');
    insert into calzado values(0, 'Zapatilla', 'Danna', 'Dan-123', 'Rojo', 25.5, 285, '2019-01-17','');
      
    insert into calzado values(0, 'Bota', 'Lueva', '401', 'Melle', 23, 275, '2019-02-10','');
    insert into calzado values(0, 'Bota', 'Lueva', '401', 'Melle', 23.5, 275, '2019-02-10','');
    insert into calzado values(0, 'Bota', 'Lueva', '401', 'Melle', 24, 275, '2019-02-10','');
    insert into calzado values(0, 'Bota', 'Lueva', '401', 'Melle', 24.5, 275, '2019-02-10','');
    insert into calzado values(0, 'Bota', 'Lueva', '401', 'Melle', 25, 275, '2019-02-10','');
    insert into calzado values(0, 'Bota', 'Jobar', '010', 'Azul', 23, 275, '2019-02-10','');
    insert into calzado values(0, 'Bota', 'Jobar', '010', 'Azul', 23.5, 275, '2019-02-10','');
    insert into calzado values(0, 'Bota', 'Jobar', '010', 'Azul', 24, 275, '2019-02-10','');
    insert into calzado values(0, 'Bota', 'Jobar', '010', 'Azul', 24.5, 275, '2019-02-10','');
    insert into calzado values(0, 'Bota', 'Jobar', '010', 'Azul', 25, 275, '2019-02-10','');
    insert into calzado values(0, 'Bota', 'Lady-Yei', '020', 'Beige', 23, 275, '2019-02-10','');
    insert into calzado values(0, 'Bota', 'Lady-Yei', '020', 'Beige', 23.5, 275, '2019-02-10','');
    insert into calzado values(0, 'Bota', 'Lady-Yei', '020', 'Beige', 24, 275, '2019-02-10','');
    insert into calzado values(0, 'Bota', 'Lady-Yei', '020', 'Beige', 24.5, 275, '2019-02-10','');
    insert into calzado values(0, 'Bota', 'Lady-Yei', '020', 'Beige', 25, 275, '2019-02-10','');
    insert into calzado values(0, 'Croc´s', 'Croc-395', '3601', 'Negro-Rosa', 24, 95, '2019-02-19','');
    insert into calzado values(0, 'Croc´s', 'Croc-395', '3601', 'Negro-Rosa', 25, 95, '2019-02-19','');
    insert into calzado values(0, 'Croc´s', 'Croc-395', '3601', 'Negro-Rosa', 26, 95, '2019-02-19','');
    insert into calzado values(0, 'Croc´s', 'Croc-395', '3601', 'Negro-Rosa', 27, 95, '2019-02-19','');
    insert into calzado values(0, 'Croc´s', 'Croc-395', '3601', 'Negro-Rosa', 28, 95, '2019-02-19','');
    insert into calzado values(0, 'Croc´s', 'Croc-396', '3601', 'Negro-Azul', 24, 95, '2019-02-19','');
    insert into calzado values(0, 'Croc´s', 'Croc-396', '3601', 'Negro-Azul', 25, 95, '2019-02-19','');
    insert into calzado values(0, 'Croc´s', 'Croc-396', '3601', 'Negro-Azul', 26, 95, '2019-02-19','');
    insert into calzado values(0, 'Croc´s', 'Croc-396', '3601', 'Negro-Azul', 27, 95, '2019-02-19','');
    insert into calzado values(0, 'Croc´s', 'Croc-396', '3601', 'Negro-Azul', 28, 95, '2019-02-19','');
    insert into calzado values(0, 'Croc´s', 'Croc-397', '3601', 'Negro-Rojo', 24, 95, '2019-02-19','');
    insert into calzado values(0, 'Croc´s', 'Croc-397', '3601', 'Negro-Rojo', 25, 95, '2019-02-19','');
    insert into calzado values(0, 'Croc´s', 'Croc-397', '3601', 'Negro-Rojo', 26, 95, '2019-02-19','');
    insert into calzado values(0, 'Croc´s', 'Croc-397', '3601', 'Negro-Rojo', 27, 95, '2019-02-19','');
    insert into calzado values(0, 'Croc´s', 'Croc-397', '3601', 'Negro-Rojo', 28, 95, '2019-02-19','');


-- -----------------------------------------------------
-- Insert `cachorrosZapateria`.`trabajador`
-- -----------------------------------------------------

insert into trabajador values('ABC001', 'Angel Emmanuel Cardenas Fernandez', 'Empleado', 'Calle Andador 2 Col.El Moral #25', 17);
insert into trabajador values('ZYX100', 'Lazaro Jimenes Hernandez', 'Encargado', 'Calle Andador 2 Colonia El Moral #40', 17);    
insert into trabajador values('ABC002', 'Mirella Bouches Ruiz', 'Empleado', 'Calle Andador 1 Colonia El Moral #50', 19);
insert into trabajador values('ZYX200', 'Irma Dominguez Hernandez', 'Encargado', 'Atenas Veracruzana Colonia Revolucion #91', 34);
insert into trabajador values('ABC003', 'Fridha Guadalupe Ramires Peña', 'Empleado', 'Calle Acapulco Colonia Progreso Macuiltepetl #78', 19);
insert into trabajador values('ABC004', 'Aneth Sarahy Ramires Peña', 'Empleado', 'Calle Acapulco Colonia Progreso Macuiltepetl #78', 17);    
insert into trabajador values('ZYX300', 'Adelaida Hernandez Perez', 'Encargado', 'Fernando V Colonia Revolucion #15', 22);
insert into trabajador values('ZYX400', 'Angel Emmanuel Hernandez Gonzalez', 'Encargado', 'Salvador Diaz Miron Colonia El Moral #25', 20);
insert into trabajador values('SLV100', 'Rufina Peña Ruiz', 'Propietario', 'Calle Acapulco Colonia Progreso Macuiltepetl #100', 50);