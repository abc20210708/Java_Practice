package day12.inherit;

public class Knight extends Warrior{
/////public class Knight extends Warrior,Monster
    ///다중 상속이 안 됨
    public Knight() {

        System.out.println("Knight 객체 생성!");
        this.name = "기사왕";
        this.rage = 11;
        info();
        attack();
        //fireSlash();
    }
}//end class
