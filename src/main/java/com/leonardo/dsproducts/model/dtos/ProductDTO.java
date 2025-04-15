package com.leonardo.dsproducts.model.dtos;

import com.leonardo.dsproducts.model.embedded.Prop;
import com.leonardo.dsproducts.model.entities.Product;
import com.leonardo.dsproducts.model.repositories.ProductRepository;
import org.springframework.data.cassandra.core.mapping.Frozen;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductDTO {

    private UUID id;
    private String department;
    private Double price;
    private Instant moment;
    private String name;
    private String description;

    private List<Prop> props = new ArrayList<>();

    public ProductDTO(){}

    public ProductDTO(UUID id, String department, Double price, Instant moment, String name, String description) {
        this.id = id;
        this.department = department;
        this.price = price;
        this.moment = moment;
        this.name = name;
        this.description = description;
    }

    public ProductDTO(Product entity){
        this.id = entity.getId();
        this.department = entity.getDepartment();
        this.price = entity.getPrice();
        this.moment = entity.getMoment();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.props.addAll(entity.getProps());
    }

    public UUID getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public Double getPrice() {
        return price;
    }

    public Instant getMoment() {
        return moment;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Prop> getProps() {
        return props;
    }
}
