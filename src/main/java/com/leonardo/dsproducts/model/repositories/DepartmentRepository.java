package com.leonardo.dsproducts.model.repositories;

import com.leonardo.dsproducts.model.entities.Department;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface DepartmentRepository extends CassandraRepository<Department, UUID> {
}
