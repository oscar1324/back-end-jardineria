-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: jardinrobledo
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `detallepresupuesto`
--
CREATE DATABASE IF NOT EXISTS `jardinrobledo`
USE `jardinrobledo`;
DROP TABLE IF EXISTS `detallepresupuesto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallepresupuesto` (
  `id_detalle_presupuesto` int NOT NULL AUTO_INCREMENT,
  `id_servicios` int DEFAULT NULL,
  `id_presupuestos` int DEFAULT NULL,
  PRIMARY KEY (`id_detalle_presupuesto`),
  KEY `id_servicios_fk_idx` (`id_servicios`),
  KEY `id_presupuestos_fk_idx` (`id_presupuestos`),
  CONSTRAINT `id_presupuestos_fk` FOREIGN KEY (`id_presupuestos`) REFERENCES `presupuestos` (`id_presupuestos`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_servicios_fk` FOREIGN KEY (`id_servicios`) REFERENCES `servicios` (`id_servicios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallepresupuesto`
--

LOCK TABLES `detallepresupuesto` WRITE;
/*!40000 ALTER TABLE `detallepresupuesto` DISABLE KEYS */;
INSERT INTO `detallepresupuesto` VALUES (1,1,1);
/*!40000 ALTER TABLE `detallepresupuesto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `presupuestos`
--

DROP TABLE IF EXISTS `presupuestos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `presupuestos` (
  `id_presupuestos` int NOT NULL AUTO_INCREMENT,
  `cantidad_terreno` int DEFAULT NULL,
  `fecha_presupuesto` varchar(45) DEFAULT NULL,
  `comentario` varchar(105) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `disabled` int DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`id_presupuestos`),
  KEY `user_FK_idx` (`username`),
  CONSTRAINT `user_FK` FOREIGN KEY (`username`) REFERENCES `users` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `presupuestos`
--

LOCK TABLES `presupuestos` WRITE;
/*!40000 ALTER TABLE `presupuestos` DISABLE KEYS */;
INSERT INTO `presupuestos` VALUES (1,500,'2021-05-16T20:20:21.648Z','ERERE','@Administrador',1,NULL),(5,500,'2021-05-13T21:06:34.328Z','Zonas arcillosas a trata.','@DonOmar',1,5),(10,200,'2021-05-15T07:38:21.096Z','Día soleado','@Usuario',1,45),(13,50,'2021-05-16T20:21:12.312Z','tttttttttttttttttttt','@Administrador',1,NULL),(14,500,'2021-05-16T20:23:09.226Z','232','@Zapatero',1,NULL),(15,50,'2021-05-17T08:31:15.929Z','Para la familia de bayern','@Lewandoski',1,NULL);
/*!40000 ALTER TABLE `presupuestos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicios`
--

DROP TABLE IF EXISTS `servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servicios` (
  `id_servicios` int NOT NULL AUTO_INCREMENT,
  `descripcion_servicio` varchar(45) DEFAULT NULL,
  `precio_metro` int DEFAULT NULL,
  PRIMARY KEY (`id_servicios`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicios`
--

LOCK TABLES `servicios` WRITE;
/*!40000 ALTER TABLE `servicios` DISABLE KEYS */;
INSERT INTO `servicios` VALUES (1,'Sistema de riego',5),(2,'Podas',6),(3,'Cesped artificial',13),(4,'mantenimiento de jardines',7),(5,'Desbrozar',35),(6,'Plantaciones',10);
/*!40000 ALTER TABLE `servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(45) NOT NULL,
  `disabled` int DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('@Administrador','yyy',1),('@Aprender','eeee',1),('@Carlos','33',1),('@Cervantes','Quevedo',1),('@Cristiano','23%&56',1),('@CristianoRonaldo','Giorgina',1),('@DonOmar','cantante334',1),('@Fariño_Gomez','we23rt45',1),('@KikeProfesor','Quevedo',1),('@Lewandoski','BayernM',1),('@manolitoGafotas','32333333',1),('@NuevoNombre','1212',1),('@Oscar_bichito','Macarrones',1),('@Pepe','23JOSE12',1),('@Pepita','222',1),('@Prueba','CHICHI',1),('@ROBBIE','eee',1),('@Roberto_firmino','Liverrpool',1),('@Roberto_Seronero','Realpepe',1),('@RubenIzq','333',1),('@titititit','errrrrrrr',1),('@TohanGomez','234/amorLOVE',1),('@Usuario','SinSal',1),('@Zapater','ZAPATO',1),('@Zapatero','23%&56',1),('@Zico','12345',1),('@Zidane','1212',1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-17 16:48:25
