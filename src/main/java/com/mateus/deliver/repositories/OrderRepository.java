package com.mateus.deliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.deliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
