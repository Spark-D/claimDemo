package com.example.demo.claim.validators;

import com.example.demo.claim.config.BeanUtil;
import com.example.demo.claim.repository.OrderClaimDao;

public class CancelValidator implements Validator{

    private static OrderClaimDao orderClaimDao;

    @Override
    public void validate() {
//        System.out.println("cancel validation");
        String getClaim = BeanUtil.getBean(OrderClaimDao.class).selectClaim();
        System.out.println(getClaim);
    }
}
