-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 17, 2022 at 05:36 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.3.33

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
('rnzdcn', 'Renzo', 'Decena', 'admin', 'admin', '12345'),
('admin123', 'Qweere', 'sadsa', 'admin', 'admin', '1234'),
('jomz123', 'Jomari', 'Custodio', '123456', '123456', '123');

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
  `description` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`id`, `medicinename`, `quantity`, `daterecieved`, `expirationdate`, `description`, `status`) VALUES
(2, 'Neozep', 1, '2022-01-01', '2022-01-17', 'Gamot', 'Not available');

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
  `contactnumber` varchar(255) NOT NULL,
  `time` varchar(255) NOT NULL,
  `bednumber` int(255) NOT NULL,
  `sick` varchar(250) NOT NULL,
  `guardiannumber` varchar(255) NOT NULL,
  `studcourse` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patients`
--

INSERT INTO `patients` (`studentid`, `firstname`, `lastname`, `middlename`, `age`, `gender`, `date`, `contactnumber`, `time`, `bednumber`, `sick`, `guardiannumber`, `studcourse`) VALUES
(201703356, 'jkh', 'jk', 'jk', 7, 'MALE', '2021-12-16', '09999999999', '12:31:46 AM', 67, 'Flu', '09999999999', ''),
(201703843, 'Dsfdsdfdsf', 'Dsfds', 'Dfsf', 34, 'MALE', '2021-12-17', '09999999999', '07:00:52 PM', 565, 'Diarrhea', '09999987666', ''),
(20183403, 'Gfh', 'Gfhgfh', 'Gfh', 34, 'MALE', '2021-12-18', '09999999999', '07:02:39 PM', 45, 'Injury', '09999975431', ''),
(20173493, 'Gfdg', 'Fdgfd', 'Fdgfd', 23, 'FEMALE', '2021-12-19', '09776543215', '07:03:16 78', 5, 'Cold', '09999999999', ''),
(20194394, 'Ghgfhfg', 'Gfhgf', 'Hgfhgf', 25, 'MALE', '2021-12-16', '09753246843', '07:04:14 PM', 5, 'Stomachache', '09999876543', ''),
(201801543, 'Dfds', 'Fdsfds', 'Fdsf', 34, 'MALE', '2021-12-16', '09787777777', '07:04:53 PM', 56, 'Headache', '09676343556', ''),
(201973954, 'Fdg', 'Fdg', 'Fdg', 34, 'MALE', '2021-12-24', '09877654673', '04:32:15 PM', 4, 'Flu', '09999999998', 'BSBM'),
(201968434, 'Fdgfdg', 'Fdgfdg', 'Fdgdf', 34, 'FEMALE', '2021-12-24', '09753578125', '04:43:29 PM', 509, 'Flu', '09999999887', 'Visitor'),
(10001, 'Fvfd', 'Fdg', 'Fdgfd', 45, 'MALE', '2021-12-24', '09999999999', '07:52:30 PM', 7, 'Flu', '09999999990', 'Visitor'),
(23232323, 'asdw', 'Sad', 'Sad', 23, 'MALE', '2021-12-25', '09333333333', '12:41:17 PM', 3, 'Flu', '09444444444', 'BSP'),
(343, 'Dfd', 'Dsfdsfds', 'Fds', 34, 'MALE', '2021-12-26', '09999999999', '10:00:58 PM', 9, 'Flu', '09999999999', 'BSP');

-- --------------------------------------------------------

--
-- Table structure for table `studentmedicine`
--

CREATE TABLE `studentmedicine` (
  `studreportno` int(11) NOT NULL,
  `studentid` int(255) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `date` date NOT NULL,
  `time` varchar(255) NOT NULL,
  `medicine` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `quantity` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentmedicine`
--

INSERT INTO `studentmedicine` (`studreportno`, `studentid`, `firstname`, `lastname`, `date`, `time`, `medicine`, `description`, `quantity`) VALUES
(6, 2444, 'sd', 'sadsa', '2021-12-09', '22', 'sdfs', 'sdf', 2),
(7, 45, 'fgd', 'fgd', '2021-12-16', '4', '9', 'fgd', 2),
(8, 2, 'Sda', 'Sda', '2021-12-14', '11:04:17 PM', '4', 'sda', 2),
(9, 343, 'Dsf', 'Dsf', '2021-12-22', '09:13:33 PM', 'biogesic', 'df', 3);

-- --------------------------------------------------------

--
-- Table structure for table `zeroquantity`
--

CREATE TABLE `zeroquantity` (
  `id` int(255) NOT NULL,
  `medicinename` varchar(255) NOT NULL,
  `quantity` int(255) NOT NULL,
  `daterecieved` date NOT NULL,
  `expirationdate` date NOT NULL,
  `description` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `zeroquantity`
--
ALTER TABLE `zeroquantity`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
