package com.toastd.demo.Service;

import com.toastd.demo.Entity.ProductList;
import com.toastd.demo.repository.ProductListRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductListService {

    private final ProductListRepository repository;

    public ProductListService(ProductListRepository repository) {
        this.repository = repository;
    }

    public Optional<ProductList> getBySlug(String slug) {
        return repository.findBySlug(slug);
    }
}