package com.desicart.service.impl;

import com.desicart.data.model.User;
import com.desicart.data.persistence.IUserMongoRepository;
import com.desicart.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    //private MongoTemplate template;
    private IUserMongoRepository users;

    @Override
    public boolean saveUser(User user){
        return false;
    }

    @Override
    public List<User> getallUser(){
        return users.getallUser();
    }


}
