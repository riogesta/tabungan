-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.23 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             11.2.0.6213
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

-- Dumping structure for table tabungan_us.tb_ambiltabungan
CREATE TABLE IF NOT EXISTS `tb_ambiltabungan` (
  `kode_ambil` int NOT NULL AUTO_INCREMENT,
  `kode_penabung` int NOT NULL,
  `ambil` int NOT NULL,
  `tgl_ambil` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`kode_ambil`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- Dumping data for table tabungan_us.tb_ambiltabungan: ~8 rows (approximately)
/*!40000 ALTER TABLE `tb_ambiltabungan` DISABLE KEYS */;
INSERT INTO `tb_ambiltabungan` (`kode_ambil`, `kode_penabung`, `ambil`, `tgl_ambil`) VALUES
	(1, 1, 5000, '21 - May - 2021'),
	(2, 1, 2000, '21 - May - 2021'),
	(3, 1, 3000, '21 - May - 2021'),
	(4, 1, 1500, '21 - May - 2021'),
	(5, 2, 2000, '21 - May - 2021'),
	(6, 2, 500, '21 - May - 2021'),
	(7, 1, 1500, '21 - May - 2021'),
	(8, 2, 1000, '21 - May - 2021'),
	(9, 1, 2000, '21 - May - 2021'),
	(10, 2, 500, '21 - May - 2021'),
	(11, 2, 5000, '22 - May - 2021'),
	(12, 3, 5000, '12 - May - 2021');
/*!40000 ALTER TABLE `tb_ambiltabungan` ENABLE KEYS */;

-- Dumping structure for table tabungan_us.tb_penabung
CREATE TABLE IF NOT EXISTS `tb_penabung` (
  `kode_penabung` int NOT NULL AUTO_INCREMENT,
  `nama` varchar(50) DEFAULT NULL,
  `jenis_kelamin` varchar(50) DEFAULT NULL,
  `no.tlp` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`kode_penabung`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Dumping data for table tabungan_us.tb_penabung: ~4 rows (approximately)
/*!40000 ALTER TABLE `tb_penabung` DISABLE KEYS */;
INSERT INTO `tb_penabung` (`kode_penabung`, `nama`, `jenis_kelamin`, `no.tlp`, `alamat`) VALUES
	(1, 'Bruce Wayne', 'Laki - Laki', '01001', 'gotham city'),
	(2, 'nathalie portman', 'Perempuan', '5000', 'earth'),
	(3, 'salsa', 'Perempuan', '0876543443', 'batujajar'),
	(4, 'ninis', 'Perempuan', '087554466', 'batujajar');
/*!40000 ALTER TABLE `tb_penabung` ENABLE KEYS */;

-- Dumping structure for table tabungan_us.tb_tabungan
CREATE TABLE IF NOT EXISTS `tb_tabungan` (
  `kode_tabungan` int NOT NULL AUTO_INCREMENT,
  `kode_penabung` int DEFAULT NULL,
  `nabung` int DEFAULT NULL,
  `tgl` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`kode_tabungan`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Dumping data for table tabungan_us.tb_tabungan: ~2 rows (approximately)
/*!40000 ALTER TABLE `tb_tabungan` DISABLE KEYS */;
INSERT INTO `tb_tabungan` (`kode_tabungan`, `kode_penabung`, `nabung`, `tgl`) VALUES
	(1, 1, 10000, '21 - May - 2021'),
	(2, 1, 20000, '21 - May - 2021'),
	(3, 2, 20000, '21 - May - 2021'),
	(4, 3, 12000, '22 - May - 2021');
/*!40000 ALTER TABLE `tb_tabungan` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
