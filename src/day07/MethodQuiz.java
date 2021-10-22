package day07;

public class MethodQuiz {//

   static double[] calcArrayTotal(int... nums) {
        int total = 0;
        for(int n: nums) {
            total += n;
        }
      double avg = (double) total / nums.length;
        return new double[] {total, avg};
    }


    public static void main(String[] args) {//

        int[] numbers = {57, 89, 78, 91, 93, 47};
        double[] arrTotAvg = calcArrayTotal(numbers);
        System.out.printf("총점: %d점, 평균: %.2f점\n"
        , (int)arrTotAvg[0], arrTotAvg[1]);

    }//
}//
