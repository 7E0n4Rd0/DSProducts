package com.leonardo.dsproducts.model.services;

import com.leonardo.dsproducts.model.dtos.DepartmentDTO;
import com.leonardo.dsproducts.model.entities.Department;
import com.leonardo.dsproducts.model.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public List<DepartmentDTO> findAll(){
        List<Department> result = repository.findAll();
        return result.stream().map(DepartmentDTO::new).toList();
    }

}
