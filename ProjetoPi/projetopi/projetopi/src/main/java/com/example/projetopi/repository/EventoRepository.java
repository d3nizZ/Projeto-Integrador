package com.example.projetopi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.projetopi.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{

Evento findByCodigo(long codigo);
}

