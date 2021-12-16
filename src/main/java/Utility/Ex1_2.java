package Utility;

public class Ex1_2 {
    private long a;
    public Ex1_2(long a){
        this.a = a;
    }

    public long getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public String printResult(long a){
        if (a%2==0) return "четное";
        return "нечетное";
    }
}
