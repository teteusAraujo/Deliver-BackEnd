package com.mateus.deliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.deliver.entities.Product;

// JpaRepository ajuda no crud ou seja operaçoes basica do da Entidady
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	public List<Product> findAllByOrderByNameAsc();
}
