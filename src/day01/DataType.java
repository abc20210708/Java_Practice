package day01;

public class DataType {

    public static void main(String[] args) {
        //정수형 타입
        byte a = 128 - 1;
        short b = 32768 -1 ;
        int c = 2147483647;
        long d = 2000000000L;
        System.out.println("d = " + d);



        //실수타입
        float f1 = 1.234567F; //4byte
        double d1 = 1.234567; //8byte

        float f2 = 1.234567891234F;
        double d2 = 1.234567891234;
        System.out.println("f2 = " + f2);
        System.out.println("d2 = " + d2);
        
        //문자타입
        char c1 = 'A'; 
        //문자 하나 저장할 때는 '' //문자 하나 저장에는 "" 사용금지
        char c2 = 51934;
        System.out.println("c2 = " + c2);

        String s1 = "hey!"; //``도 사용금지
        String s2 = "my name is Park~~";
        System.out.println(s1 + s2);

        String msg = "여기는 아주 \"위험해\"!!";
        System.out.println("msg = " + msg);
    }

}
