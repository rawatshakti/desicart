package com.desicart.service.impl;

import com.desicart.data.model.Product;
import com.desicart.data.model.Vendor;
import com.desicart.data.persistence.IProductMongoRepository;
import com.desicart.data.persistence.IVendorMongoRepository;
import com.desicart.service.IProductService;
import com.desicart.service.IVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements IVendorService {

    @Autowired
    private IVendorMongoRepository repository;

    @Override
    public List<Vendor> getVendors() {
        return repository.getVendors();
    }

}
