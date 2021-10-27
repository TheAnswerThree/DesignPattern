package com.example.Chapter1;

public abstract class Operation {
    public double _numberA = 0;
    public double _numberB = 0;

    //public double NumberA;
    public double get_numberA() {
        return _numberA;
    }

    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }

    //public double NumberB;
    public double get_numberB() {
        return _numberB;
    }

    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }

    public abstract double GetResult() throws Exception;
}
