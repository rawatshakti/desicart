package com.desicart.data.persistence.impl;

import com.desicart.data.model.dbUserDetails;
import com.desicart.data.persistence.ILoginMongoRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LoginDbUserRepositoryImpl implements ILoginMongoRepositoryImpl {
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<dbUserDetails> getLogin() {

        Query query = new Query ();
        //query.addCriteria(Criteria.where("userName").ne(null));
        List<dbUserDetails> dbUserDetails = mongoTemplate.find(query, dbUserDetails.class, "Login");
        return dbUserDetails;
    }
}
