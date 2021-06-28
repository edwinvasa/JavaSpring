package com.platzi.platzi.market.persistence.crud;

import com.platzi.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    // ejemplo de QueryMethods @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>>  findByIdCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
