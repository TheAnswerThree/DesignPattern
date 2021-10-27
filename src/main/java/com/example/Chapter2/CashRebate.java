package com.example.Chapter2;

import org.apache.logging.log4j.message.ReusableMessage;

import javax.xml.transform.Result;

public class CashRebate extends CashSuper {
    private double moneyRobate = 1d;

    public CashRebate(String moneyReabate) {
        this.moneyRobate = Double.parseDouble(moneyReabate);
    }

    @Override
    public Double acceptCash(Double Money) {
        return Money * moneyRobate;
    }
}
