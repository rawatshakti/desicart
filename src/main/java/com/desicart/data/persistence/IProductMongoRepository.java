package com.desicart.data.persistence;

import com.desicart.data.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IProductMongoRepository {
    List<Product> getProducts();
    List<Product> getProductsByVendor(String vendor);
    List<Product> getProductsByType(String type);
    List<Product> getProductsByNameLike(String name);
    List<Product> getProductsByVendorAndName(String vendor, String name);
    boolean updateProduct(Product product);
    boolean insertProduct(Product product);
    boolean deleteProduct(String productId);
}
