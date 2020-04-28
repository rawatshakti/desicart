package com.desicart.data.persistence;

import com.desicart.data.model.Product;

import java.util.List;

public interface IMongoRepository {

    List<Product> getProducts();
    Product getProducts(String productId);
    boolean updateProduct(Product product);
    boolean insertProduct(Product product);
    boolean deleteProduct(String productId);

}
