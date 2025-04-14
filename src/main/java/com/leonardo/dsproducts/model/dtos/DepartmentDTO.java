package com.leonardo.dsproducts.model.dtos;

import com.leonardo.dsproducts.model.entities.Department;

import java.util.Objects;
import java.util.UUID;

public class DepartmentDTO {

    private UUID id;
    private String name;

    public DepartmentDTO(){}

    public DepartmentDTO(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDTO(Department entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentDTO that = (DepartmentDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
