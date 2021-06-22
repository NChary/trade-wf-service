-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.17 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for trade_wf
CREATE DATABASE IF NOT EXISTS `trade_wf` /*!40100 DEFAULT CHARACTER SET armscii8 COLLATE armscii8_bin */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `trade_wf`;

-- Dumping structure for table trade_wf.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `customer_id` int(11) NOT NULL,
  `customer_name` varchar(50) CHARACTER SET armscii8 COLLATE armscii8_bin DEFAULT NULL,
  `email_id` varchar(50) CHARACTER SET armscii8 COLLATE armscii8_bin DEFAULT NULL,
  `address` varchar(50) COLLATE armscii8_bin DEFAULT NULL,
  `contact_number` varchar(50) CHARACTER SET armscii8 COLLATE armscii8_bin DEFAULT NULL,
  PRIMARY KEY (`customer_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Dumping data for table trade_wf.customer: ~1 rows (approximately)
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`customer_id`, `customer_name`, `email_id`, `address`, `contact_number`) VALUES
	(101, 'Lavanya', 'lavanya@gmail.com', 'USA', '988999899');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
