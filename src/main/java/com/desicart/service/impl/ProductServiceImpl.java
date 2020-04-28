package com.desicart.service.impl;

import com.desicart.data.model.Product;
import com.desicart.data.persistence.IProductMongoRepository;
import com.desicart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
//    @Qualifier("ProductMongoRepositoryImpl")
//    @Inject
    private IProductMongoRepository repository;


    @Override
    public List<Product> getProducts() {
        return repository.getProducts();
    }

    @Override
    public List<Product> getProductsByVendor(String vendor) {
        return repository.getProductsByVendor(vendor);
    }

    @Override
    public List<Product> getProductsByType(String type) {
        return repository.getProductsByType(type);
    }

    @Override
    public List<Product> getProductsByNameLike(String name) {
        return repository.getProductsByNameLike(name);
    }

    @Override
    public List<Product> getProductsByVendorAndName(String vendor, String name) {
        return repository.getProductsByVendorAndName(vendor, name);
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
