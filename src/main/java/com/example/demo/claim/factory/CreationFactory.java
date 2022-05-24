package com.example.demo.claim.factory;

import com.example.demo.claim.creators.Creator;
import org.springframework.stereotype.Component;

@Component
public class CreationFactory {
    public static Creator create(final String code) {
        return ClaimType.valueOf(code).creator();
    }
}
