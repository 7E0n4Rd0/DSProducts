package com.leonardo.dsproducts.model.services;

import com.leonardo.dsproducts.model.dtos.DepartmentDTO;
import com.leonardo.dsproducts.model.entities.Department;
import com.leonardo.dsproducts.model.repositories.DepartmentRepository;
import com.leonardo.dsproducts.model.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public List<DepartmentDTO> findAll(){
        List<Department> result = repository.findAll();
        return result.stream().map(DepartmentDTO::new).toList();
    }

    public DepartmentDTO findById(UUID id){
        Optional<Department> result = repository.findById(id);
        Department entity = result.orElseThrow(() -> new ResourceNotFoundException("ID not found"));
        return new DepartmentDTO(entity);
    }

}
