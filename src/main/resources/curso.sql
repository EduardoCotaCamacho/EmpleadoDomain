CREATE DATABASE  IF NOT EXISTS `curso` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `curso`;
-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: curso
-- ------------------------------------------------------
-- Server version	5.6.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleado` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `fecha_elaboracion` timestamp NULL DEFAULT NULL,
  `fecha_modificacion` timestamp NULL DEFAULT NULL,
  `empresa_id` int(5) DEFAULT NULL,
  `empresa` varchar(250) DEFAULT NULL,
  `unidad_id` int(5) DEFAULT NULL,
  `unidad` varchar(250) DEFAULT NULL,
  `usuario_id` int(5) DEFAULT NULL,
  `usuario` varchar(80) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT '1',
  `fecha_ingreso` timestamp NULL DEFAULT NULL,
  `fecha_baja` timestamp NULL DEFAULT NULL,
  `razon_baja` varchar(250) DEFAULT NULL,
  `nss` varchar(30) DEFAULT NULL,
  `nombre` varchar(80) DEFAULT NULL,
  `apellido_paterno` varchar(80) DEFAULT NULL,
  `apellido_materno` varchar(80) DEFAULT NULL,
  `rfc` varchar(80) DEFAULT NULL,
  `curp` varchar(80) DEFAULT NULL,
  `correo_grucas` varchar(80) DEFAULT NULL,
  `correo_personal` varchar(80) DEFAULT NULL,
  `numero_de_telefono` varchar(80) DEFAULT NULL,
  `celular` varchar(80) DEFAULT NULL,
  `direccion` varchar(80) DEFAULT NULL,
  `colonia` varchar(80) DEFAULT NULL,
  `ciudad` varchar(80) DEFAULT NULL,
  `estado` varchar(80) DEFAULT NULL,
  `pais` varchar(80) DEFAULT NULL,
  `cp` int(5) DEFAULT NULL,
  `fecha_nacimiento` timestamp NULL DEFAULT NULL,
  `puesto` varchar(120) DEFAULT NULL,
  `departamento` varchar(120) DEFAULT NULL,
  `dias_vacaciones_restantes` int(5) DEFAULT NULL,
  `dias_vacaciones_usados` int(5) DEFAULT NULL,
  `accesos_sistemas` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `username` varchar(12) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL,
  `unidad` varchar(15) DEFAULT NULL,
  `rol` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-22 12:10:23
