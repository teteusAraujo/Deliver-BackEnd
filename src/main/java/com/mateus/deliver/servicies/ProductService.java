package com.mateus.deliver.servicies;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateus.deliver.dto.ProductDTO;
import com.mateus.deliver.entities.Product;
import com.mateus.deliver.repositories.ProductRepository;

// Será um componente que poderemos injetar no nosso controlador

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
}
