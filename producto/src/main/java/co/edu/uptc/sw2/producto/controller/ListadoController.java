package co.edu.uptc.sw2.producto.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.uptc.sw2.producto.domain.Producto;
import co.edu.uptc.sw2.producto.service.ProductoService;

@Controller
public class ListadoController {
	private final ProductoService productService;
	
	public ListadoController(ProductoService productoService) {
		this.productService = productoService;
	}

	@RequestMapping("/")
	public String listarProductos(Model model) {
		List<Producto> destacados = productService.buscarDestacados();
		model.addAttribute("productos", destacados);
		return "listado";
	}
}
