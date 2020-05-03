package com.desicart.service;

import com.desicart.data.model.User;

import java.util.List;

public interface IUserService {
    boolean saveUser(User user);
    List<User> getallUser();
}
