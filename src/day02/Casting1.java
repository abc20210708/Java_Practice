package day02;

public class Casting1 {

    public static void main(String[] args) {

        //묵시적 형변화(promotion, upcasting)
        byte a = 100; //1바이트

        //(예)넓은 평수로 이사감
        //byte -> int 묵시적 형변환
        int b = a; //4바이트

        double c = b;
        System.out.println("c = " + c);
        
        //명시적 형변환(downcasting)
        int n = 1000;
        //byte m = n; //에러 
        byte m = (byte) n;
        System.out.println("m = " + m);

        int money = 2000;
        double price = 600.0;

        //int result = money / price; //alt + enter
        int result = (int)(money / price);
        System.out.println("result = " + result);
    
        char r = 'A';
        int o = r;
        System.out.println("o = " + o);

        //short p = (short)((byte)o);
        short p = (byte) o;

    }
}


