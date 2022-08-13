package com.idat.ec4.service;

import java.util.List;
import com.idat.ec4.model.Producto;

public interface ProductoService {
	//LISTAR
	List<Producto> listarProducto();
	
	//CREAR
	Producto crearProducto(Producto producto);
	
	//EDITAR
	Producto editarProducto(Producto producto);
	
	//ELIMINAR
	void eliminarProducto(Long id);
	
	//BUSCAR
	Producto ListarPorId(Long id);
}
