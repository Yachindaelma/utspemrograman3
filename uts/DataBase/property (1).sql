-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 30 Okt 2015 pada 09.19
-- Versi Server: 5.5.27
-- Versi PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Basis data: `property`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `ID_Costumer` varchar(20) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `Pekerjaan` varchar(100) NOT NULL,
  `Status_Perkawinan` varchar(100) NOT NULL,
  `Nomor_KTP` int(11) NOT NULL,
  `Nomor_NPWP` int(11) NOT NULL,
  `Telepon` int(11) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Alamat` varchar(500) NOT NULL,
  PRIMARY KEY (`ID_Costumer`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `customer`
--

INSERT INTO `customer` (`ID_Costumer`, `Nama`, `Pekerjaan`, `Status_Perkawinan`, `Nomor_KTP`, `Nomor_NPWP`, `Telepon`, `Email`, `Alamat`) VALUES
('1', 'Octavia', 'Karyawan', 'Belum Menikah', 987762, 878787, 98979878, 'elma@gmail.com', 'Jakarta'),
('122', 'Yachinda', 'Mahasiswa', 'Belum Menikah', 12345678, 987654, 89876554, 'elma@gmail.com', 'Jakarta'),
('124', 'Elma', 'Karyawan', 'Belum Menikah', 12345678, 987654, 8987655, 'yachinda@gmail.com', 'Cawang2');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `ID_Pengguna` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_Pengguna`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`ID_Pengguna`, `Username`, `Password`) VALUES
(1, 'Yachinda', 'yachinda'),
(2, 'Elma', 'elma'),
(3, 'Octavia', 'octavia'),
(4, 'Fanani', 'fanani');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
