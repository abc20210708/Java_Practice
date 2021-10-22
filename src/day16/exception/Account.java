package day16.exception;

public class Account {

    private int balance; //잔액

    //생성자
    public Account(int balance) {
        this.balance = balance;
    }

    //출금 기능
    public void withDraw(int money) throws Exception {
        if (balance < money) { ///잔액이 출금액보다 작음
            //에러를 유발하면 에러메시지를 보낼 수 있음.
            //throw : 유발하다 raise
            throw new Exception("잔액이 부족함!");
        }
        this.balance -= money;
    }

}//end class
