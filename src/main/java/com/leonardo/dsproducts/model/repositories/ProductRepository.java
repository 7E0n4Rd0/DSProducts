package com.leonardo.dsproducts.model.repositories;

import com.leonardo.dsproducts.model.entities.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID> {
}
