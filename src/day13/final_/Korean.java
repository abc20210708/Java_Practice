package day13.final_;

public class Korean {

    String name; //이름
    final String sid; //주민번호

    //상수는 불변성과 유일성을 만족하는 데이터
    //관례적으로 상수의 이름은 대문자 + 스네이크 케이스를 사용
    static final String MY_NATION = "대한민국"; //국적

    public Korean(String name, String sid) {
        this.name = name;
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Korean{" +
                "name='" + name + '\'' +
                ", sid='" + sid + '\'' +
                ", nation='" + MY_NATION + '\'' +
                '}';
    }
}//end class
