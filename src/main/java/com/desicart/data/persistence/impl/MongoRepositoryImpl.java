package com.desicart.data.persistence.impl;

import com.desicart.data.persistence.IMongoRepository;
import com.desicart.data.model.Product;

import java.util.List;

public class MongoRepositoryImpl implements IMongoRepository {
    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public Product getProducts(String productId) {
        return null;
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
