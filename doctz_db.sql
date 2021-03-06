-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 21, 2020 at 02:45 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `doctz_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment_tb`
--

CREATE TABLE IF NOT EXISTS `appointment_tb` (
  `appointmentId` int(10) NOT NULL AUTO_INCREMENT,
  `doctorId` int(10) NOT NULL,
  `patientId` int(10) NOT NULL,
  `hospitalId` int(10) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL,
  `amPm` varchar(10) NOT NULL,
  `invoice` text,
  `status` varchar(100) NOT NULL DEFAULT 'Incomplete',
  `isActive` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`appointmentId`),
  KEY `doctorId` (`doctorId`),
  KEY `patientId` (`patientId`),
  KEY `hospitalId` (`hospitalId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `area_tb`
--

CREATE TABLE IF NOT EXISTS `area_tb` (
  `areaId` int(10) NOT NULL AUTO_INCREMENT,
  `areaName` varchar(100) NOT NULL,
  `cityId` int(10) NOT NULL,
  `pincode` int(10) NOT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  `isActive` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`areaId`),
  KEY `cityId` (`cityId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `area_tb`
--

INSERT INTO `area_tb` (`areaId`, `areaName`, `cityId`, `pincode`, `latitude`, `longitude`, `isActive`) VALUES
(1, 'Adajan', 1, 395009, 21.1968399, 72.7789305, 1),
(2, 'Pal', 1, 394510, 21.1961855, 72.7618711, 1),
(3, 'CityLight', 1, 395007, 21.1663547, 72.7836071, 1),
(4, 'Althan', 1, 395017, 21.1538028, 72.7994403, 1),
(5, 'Bhagal', 1, 395003, 21.2002913, 72.8256376, 1),
(6, 'Varachha', 1, 395006, 21.2090154, 72.8407351, 1),
(7, 'Ring Road', 1, 395002, 21.1833622, 72.8280419, 1);

-- --------------------------------------------------------

--
-- Table structure for table `city_tb`
--

CREATE TABLE IF NOT EXISTS `city_tb` (
  `cityId` int(10) NOT NULL AUTO_INCREMENT,
  `cityName` varchar(100) NOT NULL,
  `stateId` int(10) NOT NULL,
  `isActive` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`cityId`),
  KEY `stateId` (`stateId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=16 ;

--
-- Dumping data for table `city_tb`
--

INSERT INTO `city_tb` (`cityId`, `cityName`, `stateId`, `isActive`) VALUES
(1, 'Surat', 1, 1),
(2, 'Baroda', 1, 1),
(8, 'Ahemdabad', 1, 1),
(9, 'Bhavnagar', 1, 1),
(10, 'Kutchh', 1, 1),
(11, 'Vadodara', 1, 1),
(12, 'Mumbai', 2, 1),
(13, 'Pune', 2, 1),
(14, 'Udaipur', 3, 1),
(15, 'Jaipur', 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `doctor_attachment_tb`
--

CREATE TABLE IF NOT EXISTS `doctor_attachment_tb` (
  `attachmentId` int(10) NOT NULL AUTO_INCREMENT,
  `doctorId` int(10) NOT NULL,
  `patientId` int(10) NOT NULL,
  `attachment` text NOT NULL,
  PRIMARY KEY (`attachmentId`),
  KEY `doctorId` (`doctorId`),
  KEY `patientId` (`patientId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `doctor_schedule_tb`
--

CREATE TABLE IF NOT EXISTS `doctor_schedule_tb` (
  `scheduleId` int(10) NOT NULL AUTO_INCREMENT,
  `hospitalId` int(10) NOT NULL,
  `doctorId` int(10) NOT NULL,
  `date` date NOT NULL,
  `fromTime` time NOT NULL,
  `toTime` time NOT NULL,
  `numberOfPatient` int(10) NOT NULL,
  `isActive` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`scheduleId`),
  KEY `hospitalId` (`hospitalId`),
  KEY `doctorId` (`doctorId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=20 ;

--
-- Dumping data for table `doctor_schedule_tb`
--

INSERT INTO `doctor_schedule_tb` (`scheduleId`, `hospitalId`, `doctorId`, `date`, `fromTime`, `toTime`, `numberOfPatient`, `isActive`) VALUES
(1, 8, 4, '2020-04-25', '01:00:00', '03:00:00', 10, 1),
(2, 10, 4, '2020-04-25', '05:00:00', '06:00:00', 5, 1),
(3, 8, 4, '2020-04-26', '12:30:00', '03:00:00', 25, 1),
(4, 8, 4, '2020-04-27', '01:00:00', '05:00:00', 30, 1),
(5, 10, 4, '2020-04-27', '10:00:00', '11:00:00', 10, 1),
(6, 5, 5, '2020-04-27', '10:00:00', '03:00:00', 25, 1),
(7, 5, 5, '2020-04-28', '10:00:00', '03:00:00', 25, 1),
(8, 5, 11, '2020-04-25', '10:00:00', '11:00:00', 15, 1),
(9, 6, 11, '2020-04-26', '10:00:00', '11:00:00', 15, 1),
(10, 7, 11, '2020-04-29', '10:00:00', '11:00:00', 15, 1),
(11, 7, 11, '2020-04-30', '10:00:00', '11:00:00', 15, 1),
(12, 5, 9, '2020-04-25', '10:00:00', '01:00:00', 10, 1),
(13, 6, 9, '2020-04-27', '01:00:00', '03:00:00', 10, 1),
(14, 7, 9, '2020-04-28', '02:00:00', '05:00:00', 15, 1),
(15, 8, 9, '2020-04-30', '10:00:00', '06:00:00', 50, 1),
(16, 5, 13, '2020-04-25', '10:00:00', '11:00:00', 5, 1),
(17, 6, 13, '2020-04-26', '10:00:00', '11:30:00', 10, 1),
(18, 7, 13, '2020-04-26', '01:00:00', '02:00:00', 5, 1),
(19, 8, 13, '2020-04-27', '01:00:00', '04:00:00', 20, 1);

-- --------------------------------------------------------

--
-- Table structure for table `doctor_tb`
--

CREATE TABLE IF NOT EXISTS `doctor_tb` (
  `doctorId` int(10) NOT NULL AUTO_INCREMENT,
  `doctorName` varchar(100) NOT NULL,
  `specializationId` int(11) NOT NULL,
  `experience` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `userId` int(10) NOT NULL,
  `certificates` text NOT NULL,
  `education` varchar(100) NOT NULL,
  `profile` text NOT NULL,
  `isActive` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`doctorId`),
  KEY `specializationId` (`specializationId`),
  KEY `userId` (`userId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `doctor_tb`
--

INSERT INTO `doctor_tb` (`doctorId`, `doctorName`, `specializationId`, `experience`, `gender`, `userId`, `certificates`, `education`, `profile`, `isActive`) VALUES
(4, 'Dr. Bhumik Patel\r\n', 7, '11 Years', 'Male', 26, 'Medical Registration Verified,\r\nDentist, Dental Surgeon, Implantologist', 'BDS', 'assets/img/doctors/bhumik.jpg', 1),
(5, 'Dr. Kaushika Anant Patel\r\n\r\n', 8, '21 Years', 'Female', 27, 'Gynecologist, Obstetrician, Infertility Specialist', 'MBBS,DGO', 'assets/img/doctors/kaushika.jpeg', 1),
(6, 'Dr. Kajal Mangukiya', 8, '13 Years', 'Female', 28, 'Gynecologist, Infertility Specialist, Obstetrician', 'MD - Obstetrics & Gynaecology, DGO, MBBS', 'assets/img/doctors/kajal.jpg', 1),
(7, 'Dr. Ushma K Kakkad', 7, '10 Years', 'Female', 29, 'Dentist, Implantologist, Cosmetic/Aesthetic Dentist, Dental Surgeon', 'BDS, Certificate in Cosmetic Dentistry, Comprehensive Course in Modern Endodontics, FDSRCS - Fellows', 'assets/img/doctors/ushma.jpg', 1),
(8, 'Dr. Dhawal Naik', 1, '29 Years', 'Male', 30, 'DNB - Urology/Genito - Urinary Surgery, MNAMS - Urology,\r\nUrological Surgeon', 'MBBS, MS ', 'assets/img/doctors/dhawal.jpeg', 1),
(9, 'Dr. Chetan Sheladia', 1, '11 Years', 'Male', 31, 'Urological Surgeon, Urologist, Laparoscopic Surgeon', 'DNB - Urology/Genito - Urinary Surgery, MS - General Surgery, MBBS', 'assets/img/doctors/chetan.jpg', 1),
(10, 'Dr. Bhaumik Prabhatsinh Thakor', 2, '10 Years', 'Male', 32, 'Neurosurgeon, Neurologist', 'MCh - Neuro Surgery, MBBS', 'assets/img/doctors/bhaumik.jpg', 1),
(11, 'Dr. Rajiv Raj Choudhry', 3, '33 Years ', 'Male', 33, 'Orthopedist, Spine And Pain Specialist, Joint Replacement Surgeon', 'MBBS, MS - Orthopaedics, MS - Orthopaedics', 'assets/img/doctors/rajivraj.jpg', 1),
(12, 'Dr. Krunal Shah', 3, '14 Years', 'Male', 34, 'Orthopedist, Joint Replacement Surgeon', 'MBBS, MS - Orthopaedics\r\n', 'assets/img/doctors/krunal.png', 1),
(13, 'Dr. Sulok Desai', 6, '10 Years Experience', 'Male', 35, 'Cardiologist', 'MBBS, Diploma in Cardiology', 'assets/img/doctors/sulok.jpg', 1);

-- --------------------------------------------------------

--
-- Table structure for table `fees_tb`
--

CREATE TABLE IF NOT EXISTS `fees_tb` (
  `feesId` int(10) NOT NULL AUTO_INCREMENT,
  `hospitalId` int(10) NOT NULL,
  `specializationId` int(10) NOT NULL,
  `fees` int(10) NOT NULL,
  PRIMARY KEY (`feesId`),
  KEY `hospitalId` (`hospitalId`),
  KEY `specializationId` (`specializationId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=23 ;

--
-- Dumping data for table `fees_tb`
--

INSERT INTO `fees_tb` (`feesId`, `hospitalId`, `specializationId`, `fees`) VALUES
(1, 5, 1, 300),
(2, 5, 2, 300),
(3, 5, 3, 400),
(4, 5, 6, 500),
(5, 6, 1, 350),
(6, 6, 2, 400),
(7, 6, 3, 400),
(8, 6, 6, 450),
(9, 7, 1, 200),
(10, 7, 2, 200),
(11, 7, 3, 200),
(12, 7, 6, 200),
(13, 8, 1, 400),
(14, 8, 2, 450),
(15, 8, 3, 500),
(16, 8, 6, 550),
(17, 8, 7, 300),
(18, 10, 1, 500),
(19, 10, 2, 500),
(20, 10, 3, 500),
(21, 10, 7, 500),
(22, 10, 8, 500);

-- --------------------------------------------------------

--
-- Table structure for table `group_tb`
--

CREATE TABLE IF NOT EXISTS `group_tb` (
  `groupId` int(11) NOT NULL AUTO_INCREMENT,
  `groupName` varchar(100) NOT NULL,
  PRIMARY KEY (`groupId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `group_tb`
--

INSERT INTO `group_tb` (`groupId`, `groupName`) VALUES
(1, 'admin'),
(2, 'hospital'),
(3, 'doctor'),
(4, 'patient');

-- --------------------------------------------------------

--
-- Table structure for table `hospital_facility_tb`
--

CREATE TABLE IF NOT EXISTS `hospital_facility_tb` (
  `facilityId` int(10) NOT NULL AUTO_INCREMENT,
  `hospitalId` int(10) NOT NULL,
  `specializationId` int(10) NOT NULL,
  PRIMARY KEY (`facilityId`),
  KEY `hospitalId` (`hospitalId`),
  KEY `specializationId` (`specializationId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=23 ;

--
-- Dumping data for table `hospital_facility_tb`
--

INSERT INTO `hospital_facility_tb` (`facilityId`, `hospitalId`, `specializationId`) VALUES
(1, 5, 1),
(2, 5, 2),
(3, 5, 3),
(4, 5, 6),
(5, 6, 1),
(6, 6, 2),
(7, 6, 3),
(8, 6, 6),
(9, 7, 1),
(10, 7, 2),
(11, 7, 3),
(12, 7, 6),
(13, 8, 1),
(14, 8, 2),
(15, 8, 3),
(16, 8, 6),
(17, 8, 7),
(18, 10, 1),
(19, 10, 2),
(20, 10, 3),
(21, 10, 7),
(22, 10, 8);

-- --------------------------------------------------------

--
-- Table structure for table `hospital_tb`
--

CREATE TABLE IF NOT EXISTS `hospital_tb` (
  `hospitalId` int(10) NOT NULL AUTO_INCREMENT,
  `hospitalName` varchar(100) NOT NULL,
  `address` text NOT NULL,
  `areaId` int(10) NOT NULL,
  `cityId` int(10) NOT NULL,
  `pincode` int(10) NOT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  `openingTime` time NOT NULL,
  `closingTime` time NOT NULL,
  `logo` text NOT NULL,
  `documents` text NOT NULL,
  `userId` int(10) NOT NULL,
  `isActive` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`hospitalId`),
  KEY `areaId` (`areaId`),
  KEY `cityId` (`cityId`),
  KEY `userId` (`userId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `hospital_tb`
--

INSERT INTO `hospital_tb` (`hospitalId`, `hospitalName`, `address`, `areaId`, `cityId`, `pincode`, `latitude`, `longitude`, `openingTime`, `closingTime`, `logo`, `documents`, `userId`, `isActive`) VALUES
(5, 'Shalby Hospital', 'Nr. Navyug College, Rander Road, \r\n\r\n', 1, 1, 395009, 21.1968399, 72.7789305, '08:00:00', '11:45:00', 'assets/img/hospital/h3.png', 'assets/img/hospital/h3.png', 21, 1),
(6, 'Malvia Hospital', 'Aditya Complex, Anand Mahal Rd', 1, 1, 395009, 21.2012498, 72.7925257, '07:00:00', '11:30:00', 'assets/img/hospital/h4.jpg', 'assets/img/hospital/h4.jpg', 22, 1),
(7, 'New City Hospital', '101 bhagwati ashish appartment 2, City Light Rd', 3, 1, 395007, 21.1888568, 72.7734796, '11:00:00', '08:00:00', 'assets/img/hospital/h5.jpg', 'assets/img/hospital/h5.jpg', 23, 1),
(8, 'Mahavir Hospital', 'Opposite Jivan Bharti School', 7, 1, 395001, 21.184108, 72.8115983, '06:00:00', '12:00:00', 'assets/img/hospital/h6.jpg', 'assets/img/hospital/h6.jpg', 24, 1),
(10, 'Kiran Hospital', 'Nr Sumul DairyTunki, Katargam', 6, 1, 395004, 21.2190018, 72.8366558, '06:00:00', '12:00:00', 'assets/img/hospital/h7.jpg', 'assets/img/hospital/h7.jpg', 25, 1);

-- --------------------------------------------------------

--
-- Table structure for table `patient_tb`
--

CREATE TABLE IF NOT EXISTS `patient_tb` (
  `patientId` int(11) NOT NULL AUTO_INCREMENT,
  `patientName` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `userId` int(11) NOT NULL,
  `address` text NOT NULL,
  `age` int(3) NOT NULL,
  `isActive` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`patientId`),
  KEY `userId` (`userId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `patient_tb`
--

INSERT INTO `patient_tb` (`patientId`, `patientName`, `gender`, `userId`, `address`, `age`, `isActive`) VALUES
(2, 'Riya Patel', 'Female', 38, '12,Pragati Complex,Adajan,Surat-3905009', 25, 1),
(3, 'Raj Vora', 'Male', 39, 'B-13 , Sai krupa Society,Varachha, Surat - 395009', 48, 1);

-- --------------------------------------------------------

--
-- Table structure for table `review_tb`
--

CREATE TABLE IF NOT EXISTS `review_tb` (
  `reviewId` int(10) NOT NULL AUTO_INCREMENT,
  `patientId` int(10) NOT NULL,
  `doctorId` int(10) DEFAULT NULL,
  `hospitalId` int(10) DEFAULT NULL,
  `review` varchar(100) NOT NULL,
  PRIMARY KEY (`reviewId`),
  KEY `patientId` (`patientId`),
  KEY `doctorId` (`doctorId`),
  KEY `hospitalId` (`hospitalId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `specialization_tb`
--

CREATE TABLE IF NOT EXISTS `specialization_tb` (
  `specializationId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `parentSpecializationId` int(11) NOT NULL,
  `description` varchar(100) NOT NULL,
  `image` text NOT NULL,
  `isActive` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`specializationId`),
  KEY `parentSpecializationId` (`parentSpecializationId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `specialization_tb`
--

INSERT INTO `specialization_tb` (`specializationId`, `name`, `parentSpecializationId`, `description`, `image`, `isActive`) VALUES
(1, 'Urology', 1, 'Urology is a part of health care that deals with diseases of the male and female urinary tract (kidn', 'assets/img/specialities/specialities-01.png', 1),
(2, 'Neurologist', 2, 'The neurologist treats disorders that affect the brain, spinal cord, and nerves', 'assets/img/specialities/specialities-02.png', 1),
(3, 'Orthopaedic', 3, 'Orthopaedic surgeons are devoted to the prevention, diagnosis, and treatment of disorders of the bon', 'assets/img/specialities/specialities-03.png', 1),
(6, 'Cardiologist', 6, 'A cardiologist specializes in diagnosing and treating diseases of the cardiovascular system.', 'assets/img/specialities/specialities-04.png', 1),
(7, 'Dentist', 7, 'Dentists diagnose and treat dental issues and help patients develop better oral hygiene regimens. Th', 'assets/img/specialities/specialities-05.png', 1),
(8, 'Gynecologists', 8, 'Gynecologists are doctors who specialize in women''s health, with a focus on the female reproductive ', 'assets/img/specialities/specialities-06.png', 1);

-- --------------------------------------------------------

--
-- Table structure for table `state_tb`
--

CREATE TABLE IF NOT EXISTS `state_tb` (
  `stateId` int(10) NOT NULL AUTO_INCREMENT,
  `stateName` varchar(100) NOT NULL,
  `isActive` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`stateId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `state_tb`
--

INSERT INTO `state_tb` (`stateId`, `stateName`, `isActive`) VALUES
(1, 'Gujarat', 1),
(2, 'Maharashtra', 1),
(3, 'Rajasthan', 1);

-- --------------------------------------------------------

--
-- Table structure for table `usergroup_tb`
--

CREATE TABLE IF NOT EXISTS `usergroup_tb` (
  `usergroupId` int(10) NOT NULL AUTO_INCREMENT,
  `userId` int(10) NOT NULL,
  `groupId` int(10) NOT NULL,
  PRIMARY KEY (`usergroupId`),
  KEY `userId` (`userId`),
  KEY `groupId` (`groupId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=20 ;

--
-- Dumping data for table `usergroup_tb`
--

INSERT INTO `usergroup_tb` (`usergroupId`, `userId`, `groupId`) VALUES
(1, 21, 2),
(2, 22, 2),
(3, 23, 2),
(4, 24, 2),
(5, 25, 2),
(6, 26, 3),
(7, 27, 3),
(8, 28, 3),
(9, 29, 3),
(10, 30, 3),
(11, 31, 3),
(12, 32, 3),
(13, 33, 3),
(14, 34, 3),
(15, 35, 3),
(16, 36, 1),
(17, 37, 1),
(18, 38, 4),
(19, 39, 4);

-- --------------------------------------------------------

--
-- Table structure for table `user_tb`
--

CREATE TABLE IF NOT EXISTS `user_tb` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `contact` bigint(10) NOT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=40 ;

--
-- Dumping data for table `user_tb`
--

INSERT INTO `user_tb` (`userId`, `userName`, `password`, `email`, `contact`) VALUES
(21, 'shalby', 'shalby', 'info.surat@shalby.in', 2617190000),
(22, 'malvia', 'malvia', 'malvia@gmail.com', 2612767668),
(23, 'newcity', 'newcity', 'newcity@gmail.com', 2612257100),
(24, 'mahavir', 'mahavir', 'mahavirhospital@gmail.com', 2612292000),
(25, 'kiran', 'kiran', 'info@kiranhospital.com\r\n', 2617161111),
(26, 'drbhumik', 'drbhumik', 'bhumikpatel@gmail.com', 7854616120),
(27, 'drkaushika', 'drkaushika', 'drkaushikapatel@gmail.com', 9868686875),
(28, 'drkajal', 'drkajal', 'kajalmangukiya@gmail.com', 8788456123),
(29, 'drushma', 'drushma', 'drushma@gmail.com', 8866592424),
(30, 'drdhawal', 'drdhawal', 'dhawalnaik@gmail.com', 9797565622),
(31, 'drchetan', 'drchetan', 'chetansheladia@gmail.com', 8787124650),
(32, 'drbhaumik', 'drbhaumik', 'bhaumikthakor@gmail.com', 7014989822),
(33, 'drrajivraj', 'drrajivraj', 'rajivrajchoudhry@gmail.com', 8885664400),
(34, 'drkrunal', 'drkrunal', 'krunalshah@gmail.com', 8787224458),
(35, 'drsulok', 'drsulok', 'sulokdesai@gmail.com', 9898747566),
(36, 'nidhi', 'nidhi', 'nidhimehta9399@gmail.com', 7016955943),
(37, 'nancy', 'nancy', 'kapadianancy21@gmail.com', 9428566435),
(38, 'riya', 'riya', 'riyapatel@gmail.com', 9879842122),
(39, 'raj', 'raj', 'rajvora@gmail.com', 8866414100);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `appointment_tb`
--
ALTER TABLE `appointment_tb`
  ADD CONSTRAINT `appointment_tb_ibfk_1` FOREIGN KEY (`doctorId`) REFERENCES `doctor_tb` (`doctorId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `appointment_tb_ibfk_2` FOREIGN KEY (`hospitalId`) REFERENCES `hospital_tb` (`hospitalId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `appointment_tb_ibfk_3` FOREIGN KEY (`patientId`) REFERENCES `patient_tb` (`patientId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `area_tb`
--
ALTER TABLE `area_tb`
  ADD CONSTRAINT `area_tb_ibfk_1` FOREIGN KEY (`cityId`) REFERENCES `city_tb` (`cityId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `city_tb`
--
ALTER TABLE `city_tb`
  ADD CONSTRAINT `city_tb_ibfk_1` FOREIGN KEY (`stateId`) REFERENCES `state_tb` (`stateId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `doctor_attachment_tb`
--
ALTER TABLE `doctor_attachment_tb`
  ADD CONSTRAINT `doctor_attachment_tb_ibfk_1` FOREIGN KEY (`doctorId`) REFERENCES `doctor_tb` (`doctorId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `doctor_attachment_tb_ibfk_2` FOREIGN KEY (`patientId`) REFERENCES `patient_tb` (`patientId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `doctor_schedule_tb`
--
ALTER TABLE `doctor_schedule_tb`
  ADD CONSTRAINT `doctor_schedule_tb_ibfk_1` FOREIGN KEY (`hospitalId`) REFERENCES `hospital_tb` (`hospitalId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `doctor_schedule_tb_ibfk_2` FOREIGN KEY (`doctorId`) REFERENCES `doctor_tb` (`doctorId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `doctor_tb`
--
ALTER TABLE `doctor_tb`
  ADD CONSTRAINT `doctor_tb_ibfk_1` FOREIGN KEY (`specializationId`) REFERENCES `specialization_tb` (`specializationId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `doctor_tb_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `user_tb` (`userId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `fees_tb`
--
ALTER TABLE `fees_tb`
  ADD CONSTRAINT `fees_tb_ibfk_1` FOREIGN KEY (`hospitalId`) REFERENCES `hospital_tb` (`hospitalId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fees_tb_ibfk_2` FOREIGN KEY (`specializationId`) REFERENCES `specialization_tb` (`specializationId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `hospital_facility_tb`
--
ALTER TABLE `hospital_facility_tb`
  ADD CONSTRAINT `hospital_facility_tb_ibfk_1` FOREIGN KEY (`hospitalId`) REFERENCES `hospital_tb` (`hospitalId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `hospital_facility_tb_ibfk_2` FOREIGN KEY (`specializationId`) REFERENCES `specialization_tb` (`specializationId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `hospital_tb`
--
ALTER TABLE `hospital_tb`
  ADD CONSTRAINT `hospital_tb_ibfk_1` FOREIGN KEY (`areaId`) REFERENCES `area_tb` (`areaId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `hospital_tb_ibfk_2` FOREIGN KEY (`cityId`) REFERENCES `city_tb` (`cityId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `hospital_tb_ibfk_3` FOREIGN KEY (`userId`) REFERENCES `user_tb` (`userId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `patient_tb`
--
ALTER TABLE `patient_tb`
  ADD CONSTRAINT `patient_tb_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user_tb` (`userId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `review_tb`
--
ALTER TABLE `review_tb`
  ADD CONSTRAINT `review_tb_ibfk_1` FOREIGN KEY (`hospitalId`) REFERENCES `hospital_tb` (`hospitalId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `review_tb_ibfk_2` FOREIGN KEY (`patientId`) REFERENCES `patient_tb` (`patientId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `review_tb_ibfk_3` FOREIGN KEY (`doctorId`) REFERENCES `doctor_tb` (`doctorId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `specialization_tb`
--
ALTER TABLE `specialization_tb`
  ADD CONSTRAINT `specialization_tb_ibfk_1` FOREIGN KEY (`parentSpecializationId`) REFERENCES `specialization_tb` (`specializationId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `usergroup_tb`
--
ALTER TABLE `usergroup_tb`
  ADD CONSTRAINT `usergroup_tb_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user_tb` (`userId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usergroup_tb_ibfk_2` FOREIGN KEY (`groupId`) REFERENCES `group_tb` (`groupId`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
