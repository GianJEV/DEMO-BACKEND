package com.idat.ec4.service;

import java.util.List;
import com.idat.ec4.model.Categoria;

public interface CategoriaService {
	//LISTAR
	List<Categoria> listarCategoria();
	
	//CREAR
	Categoria crearCategoria(Categoria categoria);
	
	//EDITAR
	Categoria editarCategoria(Categoria categoria);
	
	//ELIMINAR
	void eliminarCategoria(Long id);
	
	//BUSCAR
	Categoria ListarPorId(Long id);
}
