package com.mateus.deliver.dto;

import java.io.Serializable;

import com.mateus.deliver.entities.Product;


// É um objeto inchuto que carregará só o que eu quiser, dessa forma ele não estará concectado ao ORM
public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private double price;
	private String description;
	private String imageUri;
	
	public ProductDTO() {
		
	}

	public ProductDTO(Long id, String name, double price, String description, String imageUri) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageUri = imageUri;
	}

	public ProductDTO(Product entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.price = entity.getPrice();
		this.description = entity.getDescription();
		this.imageUri = entity.getImageUri();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	
	
	
}
