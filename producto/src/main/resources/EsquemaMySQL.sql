DROP TABLE IF EXISTS producto;
CREATE TABLE `producto` (
  `id_producto` int(4) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `descripcion` varchar(300) NOT NULL,
  `urlImage` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`);

ALTER TABLE `producto`
  MODIFY `id_producto` int(4) NOT NULL AUTO_INCREMENT;
COMMIT;

INSERT INTO `producto` (`id_producto`, `titulo`, `descripcion`, `urlImage`) VALUES
(0, 'Mazorca', 'Mazorca fresca, directamente desde el campo.', 'https://s.cornershopapp.com/product-images/1438892.jpg?versionId=vLtbY.S6JIV8Oi_hm35Mml1N6zEBcr8u'),
(1, 'Papa', 'Papa de todas las variedades y al mejor precio', 'https://agro.bayer.co/-/media/bcs-inter/ws_colombia/cultivos/papa/papa.png'),
(2, 'Curuba', 'Curuba de la más alta calidad.', 'https://cepass.org/wp-content/uploads/2018/01/curuba.jpg'),
(3, 'Frijol', 'Frijol de todas las variedades y al mejor precio', 'https://agrosemval.com/wp-content/uploads/2020/05/frijol-cerinza-ipc-01.jpg');
