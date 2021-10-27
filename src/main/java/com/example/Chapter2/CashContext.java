package com.example.Chapter2;

public class CashContext {
    CashSuper cs = null;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                CashNormal cs0 = new CashNormal();
                cs = cs0;
                break;
            case "满300返100":
                CashReturn cs1 = new CashReturn("300", "100");
                cs = cs1;
                break;
        }
    }

    public Double GetResult(Double money) {
        return cs.acceptCash(money);
    }

    ;
}
