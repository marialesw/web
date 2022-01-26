package co.edu.uptc.sw2.producto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.uptc.sw2.producto.domain.Producto;

public interface ProductRepository extends JpaRepository<Producto, Integer>{

	@Query("SELECT p FROM Producto p ORDER BY p.titulo")
	public List<Producto> getProducts();
	
}
