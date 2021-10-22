package day12.inherit;

public class Hunter extends  Player{

    public String beast;

    @Override
    public void info() {
        super.info();
        System.out.println("# 동물 : " + beast);
    }


    public Hunter(String name, String beast) {
        super(name);
        this.beast = beast;
    }

    public void frozenShot() {

    }

}//end class
