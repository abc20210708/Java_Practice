package day01;
//파일명이랑 크래스명 대소문자까지 똑같아야 함!
//정적 타이핑 요리보다 그릇을 먼저 준비- 자바
//동적 타이핑 알아서 그릇을 가져옴-육개장,케익
public class Variable {

    public static void main(String[] args) {

        //변수의 선언
        int score;

        //변수의 초기화
        score = 3;

        //출력 sout
        System.out.println(score);

        int life = 50; //선언과 초기화 동시 가능
        life = 100;

        int triple = score * 3;
       // System.out.println("triple = " + triple);

        //soutv
        System.out.println("triple = " + triple);

        System.out.println("life = " + life);

        System.out.println("triple * 3 = " + triple * 3);

        //정수: int, 실수: double, 문자열: String
        String nickName = "짹짹이"; //자바는 무조건 "" //''사용금지

        //타입에 맞지 않는 값은 저장 불가
        //nickName = 100;

        //변수 이름은 중복 선언 불가능
        //double score = 30.5;

        //선언이나 초기화되지 않은 변수는 사용 불가
        //int result = 10;
        //System.out.println(result);

        //$,_ 사용가능 특수문자 중에서 사용가능
        //int !!!abc; (x)



    }

}
