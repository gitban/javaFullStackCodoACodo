-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-07-2024 a las 02:57:36
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vivero`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plantas`
--

CREATE TABLE `plantas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `especie` varchar(50) NOT NULL,
  `descripcion` varchar(150) NOT NULL,
  `imagen` varchar(15) NOT NULL,
  `sol` int(11) NOT NULL,
  `agua` int(11) NOT NULL,
  `temperatura` int(11) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `plantas`
--

INSERT INTO `plantas` (`id`, `nombre`, `especie`, `descripcion`, `imagen`, `sol`, `agua`, `temperatura`, `precio`) VALUES
(0, 'CAUTUS', 'planta', 'Los cactus, también conocidos como cactáceas, son una familia de plantas suculentas que se originaron en las Américas. Son conocidos por sus tallos ca', 'cactus.svg', 80, 5, 100, 25),
(1, 'CAUTUS', 'planta', 'Los cactus, también conocidos como cactáceas, son una familia de plantas suculentas que se originaron en las Américas. Son conocidos por sus tallos ca', 'cactus.svg', 80, 5, 100, 25);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `rol_id` int(11) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `os_id` int(255) DEFAULT NULL,
  `dni` bigint(8) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`rol_id`, `created_at`, `id`, `apellido`, `os_id`, `dni`, `nombre`, `telefono`) VALUES
(NULL, NULL, 6, 'Perez', NULL, 24271970, 'Esteban', '2914779973'),
(1, NULL, 7, 'Perez', NULL, 26121959, 'Esteban', '2914779973'),
(1, NULL, 8, 'Perez', NULL, 242171970, 'Esteban Alejandro', '4779973'),
(1, NULL, 9, 'Dalgalarrondo', NULL, 26121955, 'Gabina', '2914237918'),
(1, NULL, 10, 'Dalgalarrondo', NULL, 26121951, 'Gabina', '2914237918'),
(1, NULL, 11, 'Gutierrz', NULL, 123322212, 'Bernardo', '12398762'),
(1, NULL, 12, 'Gutierrz', 5, 12332221, 'Bernardo', '12398762'),
(1, NULL, 13, 'Gutierrz', 5, 123132221, 'Bernardo', '12398762'),
(1, NULL, 14, 'Gutierrz', 2, 261219, 'Bernardo', '12398762'),
(1, NULL, 15, '', 0, NULL, '', ''),
(1, NULL, 16, 'Gutierrez', 2, 23445678, 'Pablo', '324333333'),
(1, NULL, 17, 'Gutierrez', 3, 261212323, 'Bernardo', '2914237918');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKkfsp0s1tflm1cwlj8idhqsad0` (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
