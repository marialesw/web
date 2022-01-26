package co.edu.uptc.sw2.producto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.edu.uptc.sw2.producto.domain.Producto;
import co.edu.uptc.sw2.producto.repository.ProductRepository;

@Service
public class ProductoService {
	
	public final ProductRepository productRepository;

	public ProductoService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public List<Producto> buscarDestacados(){
		return productRepository.findAll();
	};
	public Optional<Producto> getProductById(int id) {
		return productRepository.findById(id);
	}
}
