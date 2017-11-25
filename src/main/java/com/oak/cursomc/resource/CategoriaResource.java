package com.oak.cursomc.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oak.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@GetMapping
	public List<Categoria> listar() {
		Categoria c1 = new Categoria();
		c1.setId(1l);
		c1.setNome("Informática");
		Categoria c2 = new Categoria();
		c2.setId(2l);
		c2.setNome("Escritório");
		return Arrays.asList(c1, c2);
	}
	
}
