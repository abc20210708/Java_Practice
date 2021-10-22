package day14.poly.basic;

//추가 클래스 만들 땐 public을 쓸 수 없음
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

class Computer {
    //LGMonitor monitor;
    Monitor monitor;
}

class Monitor {}

class LGMonitor extends Monitor {}
class HPMonitor extends Monitor {}


//public은 클래스명과 파일명이 같아야함
public class Basic {

   Object x1 = new A();
   Object x2 = new B();
   Object x3 = new C();
   Object x4 = new D();
   A x5 = new E();
   ////자식이 부모 타입을 사용할 수 있음

    public static void main(String[] args) {
        Computer com = new Computer();
        com.monitor = new LGMonitor();
        com.monitor = new HPMonitor();


        //int[] arr = {10, "메롱"};

        double[] dArr = {
                5.5, 3.3 , 15
        };


       Monitor[] hpMonitors = {
         new HPMonitor(),
         new LGMonitor()
       };

       Object[] arr = {5, 3.14, "hello", new LGMonitor()};


    }




}//end class
