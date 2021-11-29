-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 29, 2021 at 07:12 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `clinicmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(255) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `confirmpassword` varchar(255) NOT NULL,
  `code` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `firstname`, `lastname`, `password`, `confirmpassword`, `code`) VALUES
('admin', 'Jomari', 'Custodio', 'admin', 'admin', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `id` int(255) NOT NULL,
  `medicinename` varchar(255) NOT NULL,
  `quantity` int(255) NOT NULL,
  `daterecieved` date NOT NULL,
  `expirationdate` date NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`id`, `medicinename`, `quantity`, `daterecieved`, `expirationdate`, `status`) VALUES
(2, '2', 2, '2021-11-02', '2021-11-03', 'Available'),
(3, '3', 5, '2021-10-19', '2021-10-26', 'Not available');

-- --------------------------------------------------------

--
-- Table structure for table `patients`
--

CREATE TABLE `patients` (
  `studentid` int(250) NOT NULL,
  `firstname` varchar(250) NOT NULL,
  `lastname` varchar(250) NOT NULL,
  `middlename` varchar(250) NOT NULL,
  `age` int(250) NOT NULL,
  `gender` varchar(250) NOT NULL,
  `date` date NOT NULL,
  `contactnumber` int(250) NOT NULL,
  `time` int(250) NOT NULL,
  `bednumber` int(10) NOT NULL,
  `sick` varchar(250) NOT NULL,
  `guardiannumber` int(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patients`
--

INSERT INTO `patients` (`studentid`, `firstname`, `lastname`, `middlename`, `age`, `gender`, `date`, `contactnumber`, `time`, `bednumber`, `sick`, `guardiannumber`) VALUES
(2, 'Renzo', 'a', 'c', 2, 'MALE', '2021-11-21', 5, 6, 8, 'zc', 23);

-- --------------------------------------------------------

--
-- Table structure for table `studentmedicine`
--

CREATE TABLE `studentmedicine` (
  `studentid` int(255) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `date` date NOT NULL,
  `time` int(11) NOT NULL,
  `medicine` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentmedicine`
--

INSERT INTO `studentmedicine` (`studentid`, `firstname`, `lastname`, `date`, `time`, `medicine`, `description`) VALUES
(123, 'w', 'e', '2021-11-11', 11, 'qq', 'qq'),
(213, 'qaaaa', 'w', '2021-11-04', 1, 'q', 'w');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `studentmedicine`
--
ALTER TABLE `studentmedicine`
  ADD PRIMARY KEY (`studentid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
