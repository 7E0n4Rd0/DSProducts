package com.leonardo.dsproducts.model.controllers;

import com.leonardo.dsproducts.model.dtos.DepartmentDTO;
import com.leonardo.dsproducts.model.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

}
