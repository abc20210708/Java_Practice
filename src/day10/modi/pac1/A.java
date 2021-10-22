package day10.modi.pac1;


public class A {



    public void m1() {
        int a = 10;
    }
    void m2() {} //default 제한
    private void m3() {}

    public A() {
        f1 = 1; f2 = 2; f3 = 3;
        m1(); m2(); m3();

    }
    public int f1;
    int f2;//default 제한
    private int f3;


}
