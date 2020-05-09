package com.desicart.data.persistence.impl;

import com.desicart.data.model.User;
import com.desicart.data.persistence.IUserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserMongoRepositoryImpl implements IUserMongoRepository {

    //private String SAVE="insert into Customer values (?,?,?,?,?,?,?,?)";
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public boolean saveUser(User user){
        //mongoTemplate.(SAVE,new Object[] {cust.getCust_firstName(),cust.getCust_lastName(),cust.getEmail_address(),cust.getUserName(),cust.getPassWord(),cust.getPhone_number(),cust.getCust_type(),cust.getCust_address()});
        mongoTemplate.save(user,"User");
        return false;
    }

    @Override
    public List<User> getallUser(){
        List<User> userList = mongoTemplate.findAll(User.class,"User");
        return userList;
    }

    @Override
    public User getUser(String userName, String password) {
        Query query = new Query ();
        query.addCriteria(Criteria.where("user_name").is(userName));
        query.addCriteria(Criteria.where("pw").is(password));
        User user = mongoTemplate.findOne(query, User.class, "User");
        return user;
    }

}
