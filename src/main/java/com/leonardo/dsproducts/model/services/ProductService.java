package com.leonardo.dsproducts.model.services;

import com.leonardo.dsproducts.model.dtos.ProductDTO;
import com.leonardo.dsproducts.model.entities.Product;
import com.leonardo.dsproducts.model.repositories.ProductRepository;
import com.leonardo.dsproducts.model.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public ProductDTO findById(UUID id){
        Optional<Product> result = repository.findById(id);
        Product entity = result.orElseThrow(() -> new ResourceNotFoundException("ID not found"));
        return new ProductDTO(entity);
    }


}
