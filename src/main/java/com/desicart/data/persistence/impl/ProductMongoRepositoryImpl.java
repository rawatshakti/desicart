package com.desicart.data.persistence.impl;

import com.desicart.data.model.Product;
import com.desicart.data.persistence.IProductMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component
@Repository
public class ProductMongoRepositoryImpl implements IProductMongoRepository {
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<Product> getProducts() {
        List<Product> products = mongoTemplate.findAll(Product.class, "Product");
        return products;
    }

    @Override
    public List<Product> getProductsByVendor(String vendor) {
        Query query = new Query ();
        query.addCriteria(Criteria.where("Vendor").is(vendor));
        List<Product> products = mongoTemplate.find(query, Product.class, "Product");

        return products;
    }

    @Override
    public List<Product> getProductsByType(String type) {
        Query query = new Query ();
        query.addCriteria(Criteria.where("Type").is(type));
        List<Product> products = mongoTemplate.find(query, Product.class, "Product");

        return products;
    }

    @Override
    public List<Product> getProductsByNameLike(String name) {
        Query query = new Query ();
        query.addCriteria(Criteria.where("Title").regex(name));
        List<Product> products = mongoTemplate.find(query, Product.class, "Product");

        return products;
    }

    @Override
    public List<Product> getProductsByVendorAndName(String vendor, String name) {
        Query query = new Query ();
        query.addCriteria(Criteria.where("Vendor").is(vendor));
        query.addCriteria(Criteria.where("Title").regex(name));
        List<Product> products = mongoTemplate.find(query, Product.class, "Product");

        return products;
    }

    @Override
    public boolean updateProduct(Product product) {
        return false;
    }

    @Override
    public boolean insertProduct(Product product) {
        return false;
    }

    @Override
    public boolean deleteProduct(String productId) {
        return false;
    }
}
