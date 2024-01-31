-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 31, 2024 at 05:26 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `finaldb`
--

-- --------------------------------------------------------

--
-- Table structure for table `finalcab`
--

CREATE TABLE `finalcab` (
  `name` varchar(100) NOT NULL,
  `number` varchar(100) NOT NULL,
  `pickup` varchar(100) NOT NULL,
  `dropl` varchar(100) NOT NULL,
  `pdate` date DEFAULT NULL,
  `ptime` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `finalcab`
--

INSERT INTO `finalcab` (`name`, `number`, `pickup`, `dropl`, `pdate`, `ptime`) VALUES
('REGE', 'WEFA', 'EFWAW', 'FAWE', '2024-01-17', '28:31:18.000999'),
('REGE', 'WEFA', 'EFWAW', 'FAWE', '2024-01-17', '28:31:18.000999'),
('TANUSHREE K', '09965910193', '9/3,Rajarathinam street, Nethaji road, Pollachi', 'cbe', '2024-02-09', '16:03:00.000000'),
('TANUSHREE K', '09965910193', '9/3,Rajarathinam street, Nethaji road, Pollachi', 'shjghf', '2024-02-02', '15:55:00.000000'),
('TANUSHREE K', '09965910193', '9/3,Rajarathinam street, Nethaji road, Pollachi', 'shjghf', '2024-02-02', '15:55:00.000000'),
('tanu', '9965910193', 'pollachi', 'coimbatore', '2024-01-31', '12:25:00.000000'),
('nisha', '9874563210', 'brooks', 'gandhipuram', '2024-01-31', '12:30:00.000000'),
('shiva', '9874563210', 'cbe', 'chennai', '2024-02-01', '15:00:00.000000'),
('SK', '9956910193', 'CHENNAI', 'POLLACHI', '2024-01-31', '17:01:00.000000'),
('TANUSHREE K', '09965910193', '9/3,Rajarathinam street, Nethaji road, Pollachi', 'cbe', '2024-01-31', '11:00:00.000000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
