package com.oak.cursomc;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oak.cursomc.domain.Categoria;
import com.oak.cursomc.domain.Produto;
import com.oak.cursomc.repositories.CategoriaRepository;
import com.oak.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto prod1 = new Produto(null, "Computador", 2000.00);
		Produto prod2 = new Produto(null, "Impressora", 800.00);
		Produto prod3 = new Produto(null, "Mouse", 60.00);
		
		cat1.setProdutos(new ArrayList<>());
		cat1.getProdutos().addAll(Arrays.asList(prod1, prod2, prod3));
		cat2.setProdutos(new ArrayList<>());
		cat2.getProdutos().addAll(Arrays.asList(prod2));
		
		prod1.setCategorias(new ArrayList<>());
		prod2.setCategorias(new ArrayList<>());
		prod3.setCategorias(new ArrayList<>());
		
		prod1.getCategorias().addAll(Arrays.asList(cat1));
		prod2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		prod2.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.save(Arrays.asList(cat1, cat2));
		produtoRepository.save(Arrays.asList(prod1, prod2, prod3));
	}
}
