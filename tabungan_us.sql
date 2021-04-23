-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.23 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             11.1.0.6116
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for tabungan_us
CREATE DATABASE IF NOT EXISTS `tabungan_us` /*!40100 DEFAULT CHARACTER SET latin1 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `tabungan_us`;

-- Dumping structure for table tabungan_us.tb_penabung
CREATE TABLE IF NOT EXISTS `tb_penabung` (
  `kode_penabung` int NOT NULL AUTO_INCREMENT,
  `nama` varchar(50) DEFAULT NULL,
  `jenis_kelamin` varchar(50) DEFAULT NULL,
  `no.tlp` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`kode_penabung`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Dumping data for table tabungan_us.tb_penabung: ~4 rows (approximately)
/*!40000 ALTER TABLE `tb_penabung` DISABLE KEYS */;
INSERT INTO `tb_penabung` (`kode_penabung`, `nama`, `jenis_kelamin`, `no.tlp`, `alamat`) VALUES
	(1, 'sharon', 'Perempuan', '112231', 'madrippor'),
	(2, 'bucky', 'Laki - Laki', '1122231', 'wakanda'),
	(3, 'bruce wayne', 'Laki - Laki', '000001', 'gotham city'),
	(4, 'Salsabila', 'Perempuan', '0896662277', 'Batujajar');
/*!40000 ALTER TABLE `tb_penabung` ENABLE KEYS */;

-- Dumping structure for table tabungan_us.tb_tabungan
CREATE TABLE IF NOT EXISTS `tb_tabungan` (
  `kode_tabungan` int NOT NULL AUTO_INCREMENT,
  `kode_penabung` int DEFAULT NULL,
  `nabung` int DEFAULT NULL,
  `tgl` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  PRIMARY KEY (`kode_tabungan`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table tabungan_us.tb_tabungan: ~2 rows (approximately)
/*!40000 ALTER TABLE `tb_tabungan` DISABLE KEYS */;
INSERT INTO `tb_tabungan` (`kode_tabungan`, `kode_penabung`, `nabung`, `tgl`) VALUES
	(1, 3, 5000000, '21 - April - 2021'),
	(2, 4, 6000, '21 - April - 2021');
/*!40000 ALTER TABLE `tb_tabungan` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
