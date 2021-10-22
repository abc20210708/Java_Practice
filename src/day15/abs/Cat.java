package day15.abs;

public class Cat extends Pet{


    public Cat(String name, String kind) {
        super(name, kind);
    }

    public void inject() {
        System.out.println("고양이는 간염주사를 맞아요");
    }
    public void eat() {
        System.out.println("고양이는 생선을 사료로 먹어요~");
    }
}//end class
