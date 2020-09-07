package com.microservicios.app.transacciones.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicios.app.transacciones.models.entity.Transaccion;
import com.microservicios.app.transacciones.models.repository.TransaccionRepository;

@Service
public class TransaccionServiceImpl implements TransaccionService {

	@Autowired
	private TransaccionRepository repository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Transaccion> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Transaccion> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Transaccion save(Transaccion transaccion) {
		return repository.save(transaccion);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
