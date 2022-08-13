package com.idat.ec4.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Declaramos que es una entidad
@Entity
//Colocamos el nombre que tendrá nuestra tabla en la bd
@Table(name="producto")
public class Producto {
	//La anotación ID se coloca para indicar que es nuestra primary key
	@Id
	//En nuestro generatedvalue indicamos que esa primary key
	//Será auto incrementable mediante el identity
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProducto;
	
	//Con el name asignamos el nombre del atributo en la tabla y con el length su tamaño
	//Con el nullable y el unique indicamos si tienen o no estas restricciones check
	@Column(name="descripcion", length = 100, nullable = false, unique = true)
	private String descripcion;
	//
	@Column(name="stock", nullable = false)
	private Integer stock;
	//
	@Column(name="precio", nullable = false)
	private Double precio;
	//
	@Column(name="estado", length = 20, nullable = false)
	private String estado;
	
	//Se procede a realizar la unión con las tablas referenciadas
	@ManyToOne
	@JoinColumn(name="idCategoria")
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name="idProveedor")
	private Proveedor proveedor;

	
	
	//Se crea los getters y los setters de esta entidad
	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
}
