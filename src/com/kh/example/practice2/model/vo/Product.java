package com.kh.example.practice2.model.vo;

public class Product {

    //필드
    public String pName;
    public int price;
    public String brand;

    //생성자
    public Product(String pName, int price, String brand) {
        this.pName = pName;
        this.price = price;
        this.brand = brand;

    }

    //메소드
    public void information() {
        System.out.printf("제품명: %s\n",pName);
        System.out.printf("가격: %d\n",price);
        System.out.printf("브랜드: %s\n",brand);
    }

}//end class
