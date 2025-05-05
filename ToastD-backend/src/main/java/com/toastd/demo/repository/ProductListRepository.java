package com.toastd.demo.repository;

import com.toastd.demo.Entity.ProductList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductListRepository extends JpaRepository<ProductList, Long> {
    Optional<ProductList> findBySlug(String slug);
}