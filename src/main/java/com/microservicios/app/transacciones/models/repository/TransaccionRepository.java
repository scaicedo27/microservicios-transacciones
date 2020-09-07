package com.microservicios.app.transacciones.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicios.app.transacciones.models.entity.Transaccion;

public interface TransaccionRepository extends CrudRepository<Transaccion, Long> {

}
