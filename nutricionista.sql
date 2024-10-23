-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-10-2024 a las 01:51:28
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
-- Estructura de tabla para la tabla `comida`
--

CREATE TABLE `comida` (
  `idComida` int(11) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `tipoComida` varchar(30) DEFAULT NULL,
  `caloriasX100g` int(11) DEFAULT NULL,
  `detalle` varchar(30) DEFAULT NULL,
  `baja` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `idDieta` int(11) NOT NULL,
  `nombreDieta` varchar(30) DEFAULT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFin` date DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL,
  `totalCalorias` int(11) DEFAULT NULL,
  `idPaciente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menu`
--

CREATE TABLE `menu` (
  `idMenu` int(11) NOT NULL,
  `diaNumero` int(11) DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL,
  `idDieta` int(11) DEFAULT NULL,
  `idRenglon` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id_paciente` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `edad` int(11) NOT NULL,
  `altura` double NOT NULL,
  `peso_actual` double NOT NULL,
  `peso_esperado` double NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reglondemenu`
--

CREATE TABLE `reglondemenu` (
  `idRenglon` int(11) NOT NULL,
  `idComida` int(11) DEFAULT NULL,
  `cantidadGrs` double DEFAULT NULL,
  `subTotalCalorias` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`idComida`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`idDieta`),
  ADD KEY `idPaciente` (`idPaciente`);

--
-- Indices de la tabla `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`idMenu`),
  ADD KEY `idDieta` (`idDieta`),
  ADD KEY `idRenglon` (`idRenglon`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id_paciente`);

--
-- Indices de la tabla `reglondemenu`
--
ALTER TABLE `reglondemenu`
  ADD PRIMARY KEY (`idRenglon`),
  ADD KEY `idComida` (`idComida`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`id_paciente`);

--
-- Filtros para la tabla `menu`
--
ALTER TABLE `menu`
  ADD CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`idDieta`) REFERENCES `dieta` (`idDieta`),
  ADD CONSTRAINT `menu_ibfk_2` FOREIGN KEY (`idRenglon`) REFERENCES `reglondemenu` (`idRenglon`);

--
-- Filtros para la tabla `reglondemenu`
--
ALTER TABLE `reglondemenu`
  ADD CONSTRAINT `reglondemenu_ibfk_1` FOREIGN KEY (`idComida`) REFERENCES `comida` (`idComida`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;