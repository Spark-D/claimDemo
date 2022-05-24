package com.example.demo.claim.config;

import com.example.demo.claim.common.LogService;
import com.example.demo.claim.repository.OrderClaimDao;
import com.example.demo.claim.repository.OrderClaimDaoImpl;
import com.example.demo.claim.service.ClaimService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

//    @Bean
//    public ClaimService claimService() {
//        return new ClaimService(logService() ,orderClaimDao());
//    }
//
//    @Bean
//    public OrderClaimDao orderClaimDao() {
//        return new OrderClaimDaoImpl();
//    }
//
//    @Bean
//    public LogService logService() {
//        return new LogService();
//    }
}
