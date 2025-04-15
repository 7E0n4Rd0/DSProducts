package com.leonardo.dsproducts.model.repositories;

import com.leonardo.dsproducts.model.entities.Product;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID> {

    @AllowFiltering
    List<Product> findByDepartment(String department);

    @Query("SELECT * FROM products WHERE description LIKE :TEXT")
    List<Product> findByDescription(@Param("TEXT") String text);
}
