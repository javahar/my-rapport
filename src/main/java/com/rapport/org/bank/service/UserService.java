package com.rapport.org.bank.service;

import com.rapport.org.bank.config.BankConfiguration;
import com.rapport.org.bank.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class UserService {

    private BankConfiguration bankConfiguration;

    @Autowired
    public UserService(BankConfiguration bankConfiguration) {
        this.bankConfiguration = bankConfiguration;
    }

    public User getUser(){
        User user = new User();
        user.setName(bankConfiguration.getHostName());
        user.setAge("37");
        user.setAccount_balance(new BigDecimal(120.00));

        return user;
    }
}
