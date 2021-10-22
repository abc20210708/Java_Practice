package haetbit.person.controller;

import haetbit.person.model.vo.Employee;
import haetbit.person.model.vo.Student;

public class PersonController {

  public static final int COUNT_S = 3;
  private Student[] s =  new Student[COUNT_S];
  public static final int COUNT_E = 10;
  private Employee[] e =  new Employee[COUNT_E];

  public PersonController() {

    //s[0] = new Student("강건강", 20, 178.2, 70.0, 1, "정보시스템공학과");
    //s[1] = new Student("남나눔", 21, 187.3, 80.0, 2, "경영학과");
    //s[2] = new Student("류라라", 23, 167.0, 45.0, 4, "정보통신공학과");

    //e[0] = new Employee("박보배", 26, 180.3, 72.0, 100000000, "영업부");



  }


  public int[] personCount() {
    int countS = 0;
    for (Student student : s) {
      if (student == null) break;
      countS++;
    }

    int countE = 0;
    for (Employee employee : e) {
      if (employee == null) break;
      countE++;
    }
  return new int[] {countS, countE};
  }

  public void insertStudent(String name, int age, double height, double weight, int grade, String major) {

    for (int i = 0; i < s.length; i++) {
      if (s[i] == null) {
        s[i] = new Student(name, age, height, weight, grade, major);
        return;
      }
    }
  }

  public Student[] printStudent() {
      return s;
  }

  public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {

    for (int i = 0; i < e.length; i++) {
      if (e[i] == null) {
        e[i] = new Employee(name, age, height, weight, salary, dept);
        return;
      }
    }
  }

  public Employee[] printEmployee() {
      return e;
  }

}//end class
