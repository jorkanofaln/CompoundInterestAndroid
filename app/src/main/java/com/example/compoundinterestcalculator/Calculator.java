package com.example.compoundinterestcalculator;
import java.lang.Math;
public class Calculator {
    private double value;
    private double time;
    private double interest;
    Calculator(double value,double time,double interest){
        this.interest = interest;
        this.value = value;
        this.time = time;
    }
    public double calculateFutureValue(){
        double futureValue;
        futureValue = value * Math.pow((1+interest),time);
        return futureValue;
    }
    public double calculatePresentValue(){
        double presentValue;
        presentValue = value / Math.pow((1+interest),time);
        return presentValue;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
