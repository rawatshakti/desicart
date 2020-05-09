package com.desicart.service.impl;

import com.desicart.data.model.User;
import com.desicart.data.persistence.IUserMongoRepository;
import com.desicart.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private IUserMongoRepository repository;

    @Override
    public String doLogin(String userName, String password) {
        String msg = null;
        User user = repository.getUser(userName, password);
        if (user == null) {
            msg = "Either Username or Password is incorrect";
        } else if (user.getStatus().equals("A")) {
            msg = "Welcome " + userName;
        } else {
            msg = "User Name - " + userName + " is Inactive";
        }
        return msg;
    }


    /*@Override
    public String doLogin( St) {
        String msg = "Login Failed";
        List<dbUserDetails> dbUserDetails = repository.getUser();
        for (dbUserDetails user : dbUserDetails) {
            if (loginViewModel.getUserName().equals(user.getUserName())) {
                if (user.getStatus().equals("active")) {
                    {
                        if (loginViewModel.getPassword().equals(user.getPassword())) {
                            msg = "Login successful";
                            return msg;
                        } else {
                            msg = "Either Username or Password is incorrect";
                            return msg;
                        }
                    }
                } else {
                    msg = "Account is not Active";
                    return msg;
                }
            }
        }
        return msg;
    }*/
}