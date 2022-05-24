package com.example.demo.claim.common;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogService {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Integer insertLog() {
        System.out.println("인서트 로그");
        return 1;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateLog(Integer logKey){
        System.out.println("업데이트 로그 : " +  logKey);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateLog(Integer logKey, Exception e){
        System.out.println("업데이트 로그 : " +  logKey + e.getStackTrace());
    }

}
