package day10.player;

public class Player {
    
    String name;
    int level;
    int hp;

    public Player() {
        this("이름없음");
        ///this() //나의 생성자
        ///Player("이름없음");
        ///1번을 콜하면 1번 안에서 2번을 콜하겠어요.
        ///코드 중복 제거를 위해
        System.out.println("1번 생성자!");
//        this.name = "이름없음";
//        this.level = 1;
//        this.hp = 50 + this.level * 2;
    }
    
    public Player(String name) {
        this(name,1);///항상 생성자의 첫 줄에 써야함
        //this(name,10);///이렇게 두 번은 안 됨
        System.out.println("2번 생성자!");
        ///this 붙이면 필드  //
        ///나를 참조할 때

    }

    public Player(String name, int level) {
        System.out.println("3번 생성자!");
        this.name = name;
        this.level = level;
        this.hp = 50 + this.level * 2;
    ///this.hp = 50 + this.level * 5;
        ///*5 한 번, 효율
    }

    ///자기 자신 타입의 Player this 매개변수가 숨어있어요.
    public void attack(Player this,Player target) {

        System.out.printf("%s님이 %s님을 공격합니다.\n",
                this.name, target.name);

        target.hp -= 10;

      //  System.out.println("this = " + this);
      //  System.out.println("target = " + target);
    }

    public void info() {
        System.out.printf("이름: %s, 레벨: %d, 체력: %d\n"
                            ,this.name, this.level, this.hp);


    }
    
    
}//end class
