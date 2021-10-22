package day09;

import day08.Phone;

public class Person {

    String name;
    Phone myPhone;

    //Alt+Insert 하고 ctrl+ a,
    public Person(String name, Phone myPhone) {
        this.name = name;
        this.myPhone = myPhone;
    }

    //문자메세지 보내는 기능
    void contact(Person target, String msg) {
        System.out.printf("%s님이 %s님에게 문자를 전송합니다.\n", name,target.name );
        myPhone.powerOn();
        myPhone.sendMessage(target.myPhone, msg);
    }

    void check() {
        myPhone.powerOn();
        myPhone.checkMessages();
    }

}//end class
