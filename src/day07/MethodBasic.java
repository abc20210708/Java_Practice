package day07;


/*
* 1. 자바의 메서드는 클래스 내부, 메서드 외부에 선언합니다.
* 2. 메서드의 호출은 메서드나 생성자 내부에만 가능합니다.
* */
public class MethodBasic {//

    // 1 ~ x까지의 누적합
    static int calcTotal(int x) {
       // System.out.println("야호!");
        int total = 0;
        for (int n = 1; n <= x; n++) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {//
        
        int result = calcTotal(10);//55
        System.out.println("result = " + result);
        
        int result2 = calcTotal(100);
        System.out.println("result2 = " + result2);

    }//
}//
