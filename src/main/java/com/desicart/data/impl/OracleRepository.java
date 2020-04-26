package com.desicart.data.impl;

import com.desicart.data.IRepository;
import com.desicart.model.Product;

import java.util.List;

public class OracleRepository implements IRepository {
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
