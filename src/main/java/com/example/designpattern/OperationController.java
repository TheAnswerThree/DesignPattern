package com.example.designpattern;

import com.example.Chapter1.Operation;
import com.example.Chapter1.OperationFactory;
import com.example.Chapter2.CashContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class OperationController {
    @Autowired
    @RequestMapping("/oop")
    public double Operate() {
        Operation oper;

        oper = OperationFactory.createOperate("/");
        oper.set_numberA(1);
        oper.set_numberB(0);
        double result = 0;
        try {
            result = oper.GetResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping("/csuper")
    public double Csuoer() {

        CashContext csuper = new CashContext("满300返100");
        Double totalPrices = 0d;
        totalPrices = csuper.GetResult(Double.parseDouble("700") * Double.parseDouble("3"));
        Double total = 0d;
        total = total + totalPrices;

        return total;
    }
    /*public String[] reverse(int x) {
        String[] sss={"2011-09-01","2011-09-02"};
        if (sss.length<5){
            return null;
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date star = format.parse("2020-01-01");//开始时间
        Date endDay=format.parse("2025-01-02");//结束时间
        Long starTime=star.getTime();
        Long endTime=endDay.getTime();
        // 确定一天
        long oneday=endTime-starTime;
        int count=5;
        for (int i=0;i< sss.length-1;i++){
            if ((format.parse(sss[i+1]).getTime()-format.parse(sss[i]).getTime())==oneday){
                count--;
            }else{
                count=5;
            }
            if (count==0){
                return new String[sss[i+1],sss[i],sss[i-1],sss[i-2],sss[i-3]];
            }
        }
        return null;
    }*/


}
