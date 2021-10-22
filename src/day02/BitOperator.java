package day02;

public class BitOperator {

    public static void main(String[] args) {

        //비트 연산
        byte a = 5; //00000101
        byte b = 3; //00000011

        //비트곱: 각 자리수를 곱하세요.
        System.out.println(a & b); //00000001 -> 1
        //비트합: 각 자리수를 더하세요. 단 1 + 1 = 1로처리
        System.out.println(a | b); //00000111 -> 7
        //배타적 논리합: 다르면 1, 같으면 0
        System.out.println(a ^ b); //00000110 -> 6

        //비트 이동 연산
        //왼쪽방향: 2의 이동숫자 제곱만큼 곱하세요
        //오른쪽방향: 2의 이동숫자 제곱만큼 나누세요
        int x = 192;
        System.out.println(x << 3);
        System.out.println(x >> 2);

        //비트반전
        int y = 8;             //00001000
        System.out.println(~y);//11110111
    }
}
