package co.edu.uptc.sw2.producto.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idProducto;
	private String titulo;
	private String descripcion;
	//@Column(name="urlImage")
	private String urlImage;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public Producto(String titulo, String descripcion, String urlImage) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.urlImage = urlImage;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescription() {
		return descripcion;
	}
	public void setDescription(String description) {
		this.descripcion = description;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	} 
}
