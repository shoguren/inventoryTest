package com.example.application.data.service;

import com.example.application.data.entity.SamplePerson;
import com.example.application.data.entity.StockItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StockItemRepository extends JpaRepository<StockItem, UUID> {

}