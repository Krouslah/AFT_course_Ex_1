package Utility;

import java.util.Scanner;

public class Ex1_1 {
    private double a;
    private double b;
    public Ex1_1(double a, double b) {
        this.a = a;
        this.b= b;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public double counts(double a, double b){
        return a/b;
    }
}
