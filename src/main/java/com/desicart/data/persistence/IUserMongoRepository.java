package com.desicart.data.persistence;

import com.desicart.data.model.User;

import java.util.List;

public interface IUserMongoRepository {
    boolean saveUser(User user);
    List<User> getallUser();
    User getUser(String userName, String password);
}
