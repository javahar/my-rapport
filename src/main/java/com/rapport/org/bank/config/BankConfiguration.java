package com.rapport.org.bank.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "account")
@Configuration("userProperties")
@Getter
@Setter
public class BankConfiguration {

    private String hostName;
}
