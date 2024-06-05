package com.atividade.arthur.repositories;

import com.atividade.arthur.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
