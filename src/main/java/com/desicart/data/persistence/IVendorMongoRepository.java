package com.desicart.data.persistence;

import com.desicart.data.model.Vendor;

import java.util.List;


public interface IVendorMongoRepository {
    List<Vendor> getVendors();
}