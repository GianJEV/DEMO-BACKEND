package com.idat.ec4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.idat.ec4.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
