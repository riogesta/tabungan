-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.1.72-community - MySQL Community Server (GPL)
-- Server OS:                    Win32
-- HeidiSQL Version:             11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for tabungan_us
CREATE DATABASE IF NOT EXISTS `tabungan_us` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `tabungan_us`;

-- Dumping structure for table tabungan_us.tb_ambiltabungan
CREATE TABLE IF NOT EXISTS `tb_ambiltabungan` (
  `kode_ambil` int(11) NOT NULL AUTO_INCREMENT,
  `kode_penabung` int(11) NOT NULL,
  `ambil` int(11) NOT NULL,
  `tgl_ambil` date DEFAULT NULL,
  PRIMARY KEY (`kode_ambil`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;

-- Dumping data for table tabungan_us.tb_ambiltabungan: ~5 rows (approximately)
/*!40000 ALTER TABLE `tb_ambiltabungan` DISABLE KEYS */;
INSERT INTO `tb_ambiltabungan` (`kode_ambil`, `kode_penabung`, `ambil`, `tgl_ambil`) VALUES
	(15, 1, 5000, '2021-06-20'),
	(17, 2, 10000, '2021-06-20'),
	(19, 3, 10000, '2021-06-20'),
	(20, 6, 4000, '2021-06-23'),
	(21, 5, 10000, '2021-06-22');
/*!40000 ALTER TABLE `tb_ambiltabungan` ENABLE KEYS */;

-- Dumping structure for table tabungan_us.tb_penabung
CREATE TABLE IF NOT EXISTS `tb_penabung` (
  `kode_penabung` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(50) DEFAULT NULL,
  `jenis_kelamin` varchar(50) DEFAULT NULL,
  `telp` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`kode_penabung`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Dumping data for table tabungan_us.tb_penabung: ~5 rows (approximately)
/*!40000 ALTER TABLE `tb_penabung` DISABLE KEYS */;
INSERT INTO `tb_penabung` (`kode_penabung`, `nama`, `jenis_kelamin`, `telp`, `alamat`) VALUES
	(1, 'Bruce Wayne', 'Laki - Laki', '08231122110', 'Jakarta'),
	(2, 'nathalie portman', 'Perempuan', '089888111222', 'palembang'),
	(4, 'ninis', 'Perempuan', '087554466', 'batujajar'),
	(5, 'Lesti kejora Cahyani', 'Perempuan', '0823198881', 'Banten'),
	(6, 'zahra', 'Perempuan', '083111999321', 'Bandung');
/*!40000 ALTER TABLE `tb_penabung` ENABLE KEYS */;

-- Dumping structure for table tabungan_us.tb_tabungan
CREATE TABLE IF NOT EXISTS `tb_tabungan` (
  `kode_tabungan` int(11) NOT NULL AUTO_INCREMENT,
  `kode_penabung` int(11) DEFAULT NULL,
  `nabung` int(11) DEFAULT NULL,
  `tgl` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`kode_tabungan`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- Dumping data for table tabungan_us.tb_tabungan: ~8 rows (approximately)
/*!40000 ALTER TABLE `tb_tabungan` DISABLE KEYS */;
INSERT INTO `tb_tabungan` (`kode_tabungan`, `kode_penabung`, `nabung`, `tgl`) VALUES
	(1, 1, 10000, '21 - May - 2021'),
	(2, 1, 20000, '21 - May - 2021'),
	(3, 2, 20000, '21 - May - 2021'),
	(4, 3, 12000, '22 - May - 2021'),
	(5, 6, 5000, '22 - June - 2021'),
	(6, 5, 15000, '22 - June - 2021'),
	(8, 1, 30000, '22 - June - 2021'),
	(9, 1, 10000, '22 - June - 2021');
/*!40000 ALTER TABLE `tb_tabungan` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
