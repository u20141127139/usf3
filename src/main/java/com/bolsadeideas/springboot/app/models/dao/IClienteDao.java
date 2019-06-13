package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

// Ese Long sería la llave primaria
public interface IClienteDao extends CrudRepository<Cliente, Long> {
	
	
}
