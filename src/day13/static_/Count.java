package day13.static_;

public class Count {

    public int x; //인스턴스 필드
    public static int y; //스태틱 필드

    //인스턴스 메서드
    public void m1() {
        System.out.println("x: " + x);
    }
    //스태틱 메서드
    ///메모리에 딱 하나
    public static void m2() {
        //System.out.println(x);
        System.out.println("y: " + y);
    }


}//end class
