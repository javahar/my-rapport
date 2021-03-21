package com.rapport.org.bank.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class User {
    private String name;
    private String age;
    private BigDecimal account_balance;
}
