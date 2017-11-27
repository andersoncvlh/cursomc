package com.oak.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oak.cursomc.domain.Categoria;
import com.oak.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoraiRepository;
	
	public List<Categoria> buscarPorFiltro() {
		return categoraiRepository.findAll();
	}
	
	public Categoria buscar(Long id) {
		return categoraiRepository.findOne(id);
	}
	
}
