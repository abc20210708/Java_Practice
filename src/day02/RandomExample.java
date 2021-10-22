package day02;

public class RandomExample {

    public static void main(String[] args) {

      double rn = Math.random();
        System.out.println("rn = " + rn);
        
        /*
            # 1 ~ 10까지의 랜덤 정수
            
            Math.random()           ->  0.0 <= ~ < 1.0
            Math.random() * 10       -> 0.0 <= ~ < 10.0
             (int)(Math.random() * 10) + 1 -> 1<= ~ < 11
             
             # 공식: x이상 y이하 랜덤정수
             (int) (Math.random() * (y-x+1)) + x
         */

        //int ri = (int)Math.random() * 10 + 1;
        int ri = (int) (Math.random() * 10) + 1;



        System.out.println("ri = " + ri);
        
    }
}
