package com.desicart.data;

import com.desicart.model.Product;

import java.util.List;

public interface IRepository {

    List<Product> getProducts();
    Product getProducts(String productId);
    boolean updateProduct(Product product);
    boolean insertProduct(Product product);
    boolean deleteProduct(String productId);

}
