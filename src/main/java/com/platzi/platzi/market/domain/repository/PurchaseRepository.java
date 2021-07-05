package com.platzi.platzi.market.domain.repository;

import com.platzi.platzi.market.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll(); //para optener todas las compras
    Optional<List<Purchase>> getByClient(String clientId); // para optener las compras realziadas por un cliente
                                                            //en caso de que un cliente no tenga compras por eso se usa Optional
    Purchase save(Purchase purchase); // para registrar una compra

}
