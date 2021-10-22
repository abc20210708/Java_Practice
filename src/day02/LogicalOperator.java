package day02;

public class LogicalOperator {

    public static void main(String[] args) {

        int x = 10, y = 20;

        //&& || 단축평가 그래서 y가 ++ 안 먹음음
       boolean result1 = (x != 10) && (++y == 21);
        boolean result2 = (x == 10) || (++y == 21);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
