package day16.exception;

public class Main {

    public static void main(String[] args) {

//        Student kim = new Student("김철수");
//        kim.insertScore();

        //System.out.println("프로그램 정상 종료");

        System.out.println("======================");

        Account acc = new Account(5000);

        try {
            acc.withDraw(11000);
        } catch (Exception e) {
           String message =  e.getMessage();///경고문을 볼 수 있음
            System.out.println("message = " + message);
            //에러 로그 확인
            e.printStackTrace();///빨간색 메세지, 프로그램이 터지진 않아욥
        }


    }//end main
}//end class
