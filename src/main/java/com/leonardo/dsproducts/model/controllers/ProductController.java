package com.leonardo.dsproducts.model.controllers;

import com.leonardo.dsproducts.model.dtos.ProductDTO;
import com.leonardo.dsproducts.model.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable UUID id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findByDepartment(
            @RequestParam(name = "department", defaultValue = "") String department){
        return ResponseEntity.ok(service.findByDepartment(department));
    }

    @GetMapping(value = "/description")
    public ResponseEntity<List<ProductDTO>> findByDescription(
            @RequestParam(name = "text", defaultValue = "") String text){
        return ResponseEntity.ok(service.findByDescription(text));
    }
}
