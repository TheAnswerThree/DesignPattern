package com.example.Chapter1;

public class OperationSub extends Operation {
    @Override
    public double GetResult() {
        double result = 0;
        result = get_numberA() - get_numberB();
        return result;
    }
}
