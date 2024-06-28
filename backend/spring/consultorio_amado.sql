-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-06-2024 a las 16:12:28
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.1.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `consultorio_amado`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `obras_sociales`
--

CREATE TABLE `obras_sociales` (
  `id_os` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `telefono` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turnos`
--

CREATE TABLE `turnos` (
  `id_turno` int(11) NOT NULL,
  `turno_fecha` date NOT NULL,
  `asignado` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `rol_id` int(11) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`rol_id`, `created_at`, `id`, `apellido`, `direccion`, `email`, `nombre`, `telefono`) VALUES
(1, NULL, 1, 'Dalgalarrondo', 'Matheu 2878', 'gabina@gmail.com', 'Gabina Elena', '291-4237918'),
(1, NULL, 2, 'Perez', 'Matheu 2878', 'estalej@gmail.com.ar', 'Esteban Alejandro', '291-4779973'),
(1, NULL, 3, 'Perez Dalgalarrondo', 'Matheu 2878', 'ferminchin@gmail.com', 'Fermin', '291-4237918'),
(1, NULL, 4, 'Perez Dalgalarrondo', 'Matheu 2878', 'emilita@gmail.com', 'Emilia', '291-4237918');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKkfsp0s1tflm1cwlj8idhqsad0` (`email`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
