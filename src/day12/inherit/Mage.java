package day12.inherit;

public class Mage extends Player {

    public int mana;

////이렇게 코드가 생략되어 있음!!
    public Mage() {
        super();
   }

    public Mage(String name) {
        super(name);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("# 마력: " + mana);
    }

    public void fireball() {

    }
}//end class
