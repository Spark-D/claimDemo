package com.example.demo.claim.repository;

import org.springframework.stereotype.Repository;

//@Repository
public class OrderClaimDaoImpl implements OrderClaimDao{
    @Override
    public void insert(String insertData) {
        System.out.println("order claim insert :" + insertData);
    }

    @Override
    public void update(String updateData) {
        System.out.println("order claim update :" + updateData);
    }
}
