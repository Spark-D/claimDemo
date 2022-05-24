package com.example.demo.claim.factory;

import com.example.demo.claim.creators.CancelCreator;
import com.example.demo.claim.creators.Creator;
import com.example.demo.claim.validators.CancelValidator;
import com.example.demo.claim.validators.Validator;

public enum ClaimType {

    CANCEL("C") {
        @Override
        Creator creator() {
            return new CancelCreator();
        }

        @Override
        Validator validator() {
            return new CancelValidator();
        }
    },
    RETURN("R") {
        @Override
        Creator creator() {
            return null;
        }

        @Override
        Validator validator() {
            return null;
        }
    },
    EXCHANGE("X") {
        @Override
        Creator creator() {
            return null;
        }

        @Override
        Validator validator() {
            return null;
        }
    };

    private final String code;

    ClaimType(String code) {
        this.code = code;
    }

    abstract Creator creator();

    abstract Validator validator();

}
