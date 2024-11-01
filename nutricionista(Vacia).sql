-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-11-2024 a las 20:08:14
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
-- Base de datos: `nutricionista`
--
CREATE DATABASE IF NOT EXISTS `nutricionista` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `nutricionista`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comidas`
--

CREATE TABLE `comidas` (
  `id_comida` int(11) NOT NULL,
  `nombre` varchar(99) DEFAULT NULL,
  `calorias_por_100g` int(11) DEFAULT NULL,
  `tipo` varchar(99) DEFAULT NULL,
  `detalle` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietas`
--

CREATE TABLE `dietas` (
  `id_dieta` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `id_paciente` int(11) DEFAULT NULL,
  `peso_inicial` float DEFAULT NULL,
  `peso_final` float DEFAULT NULL,
  `calorias_totales` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menus_diarios`
--

CREATE TABLE `menus_diarios` (
  `id_menu_diario` int(11) NOT NULL,
  `dia` int(11) DEFAULT NULL,
  `calorias_totales` int(11) DEFAULT NULL,
  `id_dieta` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `id_paciente` int(11) NOT NULL,
  `nombre` varchar(99) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `altura` float DEFAULT NULL,
  `peso_actual` float DEFAULT NULL,
  `peso_buscado` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `renglones_menu`
--

CREATE TABLE `renglones_menu` (
  `id_renglon` int(11) NOT NULL,
  `id_menu_diario` int(11) DEFAULT NULL,
  `id_comida` int(11) DEFAULT NULL,
  `cantidad_gramos` int(11) DEFAULT NULL,
  `subtotal_calorias` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comidas`
--
ALTER TABLE `comidas`
  ADD PRIMARY KEY (`id_comida`);

--
-- Indices de la tabla `dietas`
--
ALTER TABLE `dietas`
  ADD PRIMARY KEY (`id_dieta`),
  ADD KEY `id_paciente` (`id_paciente`);

--
-- Indices de la tabla `menus_diarios`
--
ALTER TABLE `menus_diarios`
  ADD PRIMARY KEY (`id_menu_diario`),
  ADD KEY `id_dieta` (`id_dieta`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`id_paciente`);

--
-- Indices de la tabla `renglones_menu`
--
ALTER TABLE `renglones_menu`
  ADD PRIMARY KEY (`id_renglon`),
  ADD KEY `id_menu_diario` (`id_menu_diario`),
  ADD KEY `id_comida` (`id_comida`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comidas`
--
ALTER TABLE `comidas`
  MODIFY `id_comida` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `dietas`
--
ALTER TABLE `dietas`
  MODIFY `id_dieta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `menus_diarios`
--
ALTER TABLE `menus_diarios`
  MODIFY `id_menu_diario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  MODIFY `id_paciente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `renglones_menu`
--
ALTER TABLE `renglones_menu`
  MODIFY `id_renglon` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dietas`
--
ALTER TABLE `dietas`
  ADD CONSTRAINT `dietas_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `pacientes` (`id_paciente`);

--
-- Filtros para la tabla `menus_diarios`
--
ALTER TABLE `menus_diarios`
  ADD CONSTRAINT `menus_diarios_ibfk_1` FOREIGN KEY (`id_dieta`) REFERENCES `dietas` (`id_dieta`);

--
-- Filtros para la tabla `renglones_menu`
--
ALTER TABLE `renglones_menu`
  ADD CONSTRAINT `renglones_menu_ibfk_1` FOREIGN KEY (`id_menu_diario`) REFERENCES `menus_diarios` (`id_menu_diario`),
  ADD CONSTRAINT `renglones_menu_ibfk_2` FOREIGN KEY (`id_comida`) REFERENCES `comidas` (`id_comida`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
