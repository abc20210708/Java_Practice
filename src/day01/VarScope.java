package day01;

public class VarScope {

    public static void main(String[] args) {
        //같은 타입 변수 한 줄로 가능함
        int num1 = 10, num2 = 20;
    
        //변수는 선언된 블록을 벗어나면
        //메모리에서 자동제거 됩니다.
        if (true) {
            int num3 = num1 + num2;//참조 만들어진 거 쓰는 거
            num2 = num3 * 2;
        }// end if
        
        int num3 = 100;
        int num4 = num3 * num1;
    } //end main
    //int num5 = num1;//main 나와서 num1 안 됨
}// end class //꿀팁
