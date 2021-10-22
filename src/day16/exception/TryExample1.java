package day16.exception;

public class TryExample1 {

    public static void main(String[] args) {

        int n1 = 10, n2 = 0; //n2가 2이면 catch 실행 안 함
        System.out.println("나눗셈 시작!");

        try {
            //예외 발생 가능성이 있는 코드
            int result = n1 / n2 ;
            System.out.printf("%d / %d = %d\n", n1, n2, result);
        } catch (Exception e) {
            //예외 발생시 작동할 코드
            System.out.println("0으로 나눌 수 없습니다.");
            ////catch가 에러를 잡아줌!
        }

        System.out.println("프로그램 정상 종료!");
    }//end main
}//end class
