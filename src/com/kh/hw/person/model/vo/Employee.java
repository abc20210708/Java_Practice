package com.kh.hw.person.model.vo;

public class Employee extends Person{

    private int salary; //급여
    private String dept; //부서

    public Employee() {

    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(name, age, height, weight);
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String toString() {
        return String.format("(%s ,%d, %f, %f )",getName() ,getAge(),getHeight(), getWeight());
    }
}//end class
