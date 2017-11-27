package com.oak.cursomc.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oak.cursomc.domain.Categoria;
import com.oak.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> listar() {
		return ResponseEntity.ok().body(categoriaService.buscarPorFiltro());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> buscar(@PathVariable Long id) {
		return ResponseEntity.ok().body(categoriaService.buscar(id));
	}
	
}
