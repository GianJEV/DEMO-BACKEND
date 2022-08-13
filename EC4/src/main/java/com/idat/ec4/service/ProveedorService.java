package com.idat.ec4.service;

import java.util.List;
import com.idat.ec4.model.Proveedor;

public interface ProveedorService {
	//LISTAR
	List<Proveedor> listarProveedor();
	
	//CREAR
	Proveedor crearProveedor(Proveedor proveedor);
	
	//EDITAR
	Proveedor editarProveedor(Proveedor proveedor);
	
	//ELIMINAR
	void eliminarProveedor(Long id);
	
	//BUSCAR
	Proveedor ListarPorId(Long id);
}
