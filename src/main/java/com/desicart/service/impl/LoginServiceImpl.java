package com.desicart.service.impl;

import com.desicart.data.model.dbUserDetails;
import com.desicart.data.persistence.ILoginMongoRepositoryImpl;
import com.desicart.data.viewmodel.LoginViewModel;
import com.desicart.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private ILoginMongoRepositoryImpl iLoginMongoRepository;

    @Override
    public String getLogin(LoginViewModel loginViewModel) {
        String msg = "Login Failed";
        List<dbUserDetails> dbUserDetails = iLoginMongoRepository.getLogin();
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
    }
}