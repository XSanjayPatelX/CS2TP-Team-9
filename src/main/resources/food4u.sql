-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 09, 2023 at 03:32 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `food4u`
--

-- --------------------------------------------------------

--
-- Table structure for table `food_item`
--

CREATE TABLE `food_item` (
  `id` int(11) NOT NULL,
  `price` float DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `alt_text` longtext DEFAULT NULL,
  `created_at` date DEFAULT NULL,
  `updated_at` date DEFAULT NULL,
  `food` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `food_item`
--

INSERT INTO `food_item` (`id`, `price`, `image`, `description`, `category`, `stock`, `alt_text`, `created_at`, `updated_at`, `food`) VALUES
(2, 1.99, 'Brownie.jpg', 'A brownie', 'Dessert', 23, 'brownie', NULL, '2023-03-01', 'Brownies'),
(3, 1.99, 'Coke.jpg', 'Coca Cola', 'Drinks', 232, 'coke', NULL, '2023-03-01', 'Coke');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `order_item_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `order_date` datetime NOT NULL,
  `estimated_delivery` datetime NOT NULL,
  `is_delivered` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `order_item`
--

CREATE TABLE `order_item` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` float NOT NULL,
  `category` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email_address` varchar(255) NOT NULL,
  `password` varchar(500) NOT NULL,
  `is_admin` tinyint(1) NOT NULL,
  `join_date` date NOT NULL,
  `address_line1` varchar(255) NOT NULL,
  `address_line2` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `postcode` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `first_name`, `last_name`, `email_address`, `password`, `is_admin`, `join_date`, `address_line1`, `address_line2`, `city`, `postcode`) VALUES
(1, 'john', '', 'admin@food4u.com', 'test123', 0, '2023-02-26', 'dsadfasfaf', '', '', '3123123'),
(3, 'Sam', 'Fisher', 'Sam.Fisher@gmail.com', 'SamF1234', 1, '2023-02-26', '123 prince road', 'adasdasd', 'Birmingham', 'B47DDA'),
(4, 'hamzah', 'hussain', 'hasdas@gmail.com', 'fasfasdwqadqdqwdqwdq', 0, '2023-02-26', 'hdiwqhidhwq', 'dasdfasfasfaf', 'iudhwqidhqih', 'hiuhihqwdwq'),
(5, 'dsafgqew', 'wqdwqdwqd', 'qwdqwdqw@gmail.com', 'gheduqwghdugwqu', 0, '2023-02-26', 'huidqwhquihwd', 'iuhihdfqiuhqd', 'ihiuhdiqhiq', 'hihihq'),
(6, 'jack', 'hill', 'hashd@gmail.com', 'hhdiqwh', 0, '2023-02-27', 'hiuhihdqah', 'hiuhhuihi', 'iuhiuhih', 'hihiu');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `food_item`
--
ALTER TABLE `food_item`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `order_item`
--
ALTER TABLE `order_item`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `food_item`
--
ALTER TABLE `food_item`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `order_item`
--
ALTER TABLE `order_item`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
