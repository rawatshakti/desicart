package com.desicart.service;

import com.desicart.data.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getProducts();
    List<Product> getProductsByVendor(String vendor);
    List<Product> getProductsByType(String type);
    List<Product> getProductsByNameLike(String name);
    List<Product> getProductsByVendorAndName(String vendor, String name);
    boolean updateProduct(Product product);
    boolean insertProduct(Product product);
    boolean deleteProduct(String productId);
}
