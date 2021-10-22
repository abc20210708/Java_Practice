package day01;

public class StdOutput {

    public static void main(String[] args) {

        String dog = "멍멍이";
        String cat = "야옹이";

        System.out.print(dog + "\n"); //ctrl+ d
        System.out.println(cat); //자동 줄 개행 일어나지 않습니다.

        int month = 10;
        int day = 9;
        String anni = "한글날";

        System.out.println(month + "월 " + day + "일은 " + anni + "입니다.");

        //정수: %d, 실수: %f, 문자: %s //souf
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);

        //System.out.printf("?월 ?일은 ?입니다.", month, day, anni);
        System.out.println("메롱메롱");

        //에러
        //System.out.printf("%d월 %d일은 %s입니다.\n", month, day);

        //에러는 안 나지만
        //System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni, 350);

        //불법임
        //System.out.printf("%d월 %d일은 %d입니다.\n", month, day, anni, 350);

        double saleRate = 0.2532;
        // %f는 무조건 소수점 6자리까지 표현합니다.
        System.out.printf("할인비율: %.2f\n", saleRate);
        //% ->  %% 두 번
        System.out.printf("할인비율: %.2f%%\n", saleRate * 100);
    }

}
