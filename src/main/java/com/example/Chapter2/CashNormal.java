package com.example.Chapter2;

public class CashNormal extends CashSuper {
    @Override
    public Double acceptCash(Double money) {
        return money;
    }
}
