package com.example.demo.claim.factory;

import com.example.demo.claim.validators.Validator;
import org.springframework.stereotype.Component;

@Component
public class ValidationFactory {
    public static Validator create(final String code) {
        return ClaimType.valueOf(code).validator();
    }
}
