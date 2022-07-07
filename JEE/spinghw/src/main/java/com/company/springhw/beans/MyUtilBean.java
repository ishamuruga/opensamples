package com.company.springhw.beans;

public class MyUtilBean {
    private int salary;

    private int dept;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MyUtilBean(int _dept,int _salary) {
        this.salary = _salary;
        this.dept = _dept;
        System.out.println("in Util Cons....");
    }

    @Override
    public String toString() {
        return "MyUtilBean [dept=" + dept + ", salary=" + salary + "]";
    }


    
}
