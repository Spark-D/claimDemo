package com.example.demo.claim.service;

import com.example.demo.claim.common.LogService;
import com.example.demo.claim.common.MessageService;
import com.example.demo.claim.config.ApplicationContextProvider;
import com.example.demo.claim.factory.CreationFactory;
import com.example.demo.claim.factory.ValidationFactory;
import com.example.demo.claim.repository.OrderClaimDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

//@Service
//@RequiredArgsConstructor
public class ClaimService {

    private final LogService logService;
    private final OrderClaimDao dao;
    private MessageService messageService;


    public ClaimService(LogService logService, OrderClaimDao dao) {
        this.logService = logService;
        this.dao = dao;

    }

    @Transactional
    public void commonClaimProcess(String type) {
        Integer logKey = logService.insertLog();
        try {
            ValidationFactory.create(type).validate();
            dao.insert(CreationFactory.create(type).makeCreatData());
            dao.update(CreationFactory.create(type).makeUpdateData());
            messageService.send();
        } catch (Exception e) {
            logService.updateLog(logKey, e);
        } finally {
            logService.updateLog(logKey);
        }
    }


}
