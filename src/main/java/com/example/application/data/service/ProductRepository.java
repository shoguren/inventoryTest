package com.example.application.data.service;

import com.example.application.data.entity.Product;
import com.example.application.data.entity.StockItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}