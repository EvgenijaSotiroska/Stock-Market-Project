package com.example.project1.observers;

import com.example.project1.model.CompanyDataModel;


public class LoggingObserver implements Observer {

    @Override
    public void update(CompanyDataModel companyDataModel) {
        System.out.println(String.format("Data changed. For company: %s, " +
                "lastTransaction: %s, on date: %s", companyDataModel.getId(), companyDataModel.getLastTransactionPrice(),
                companyDataModel.getDate()));
    }
}
