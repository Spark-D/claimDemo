package com.example.demo.claim.creators;

public class CancelCreator implements Creator{

    @Override
    public String makeCreatData() {
        return "Cancel 생성 데이터";
    }

    @Override
    public String makeUpdateData() {
        return "Cancel 변경 데이터";
    }
}
