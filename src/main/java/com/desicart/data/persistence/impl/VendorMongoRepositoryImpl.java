package com.desicart.data.persistence.impl;

import com.desicart.data.entity.ProductEntity;
import com.desicart.data.model.Product;
import com.desicart.data.model.Vendor;
import com.desicart.data.persistence.IVendorMongoRepository;
import com.desicart.util.Helper;
import com.mongodb.client.DistinctIterable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class VendorMongoRepositoryImpl implements IVendorMongoRepository {
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<Vendor> getVendors() {

        Query query = new Query ();
        query.addCriteria(Criteria.where("Vendor").ne(null));
        List<Product> products = mongoTemplate.find(query, Product.class, "Product");
        return products.stream()
                .filter(Helper.distinctByKey(Product::getVendor))
                .map(p -> new Vendor(p.getVendor(), p.getVendor(), null, null))
                .collect(Collectors.toList());
    }

//    @Override
//    public List<Vendor> getVendors() {
//
////        Query query = new Query ();
////        query.addCriteria(Criteria.where("Vendor").is(vendor));
//        //List<Product> products = mongoTemplate.findDistinct("Vendor", ProductEntity.class, Product.class);
//        DistinctIterable<Product> products = mongoTemplate.getCollection("Product").distinct("Vendor", Product.class);
//        List<Vendor> vendors = new ArrayList<>();
////        for (Product product:products) {
////            vendors.add(new Vendor(product.vendor,product.vendor,"",""));
////        }
//
//        return vendors;
//    }
}
