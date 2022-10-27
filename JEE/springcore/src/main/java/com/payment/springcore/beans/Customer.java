package com.payment.springcore.beans;

public class Customer extends BaseBean {

    //public static int counter=0;

    public Customer(){
        System.out.println(" My Customer got Loaded.....");
    }
    
    private String custName;

    private int age;

    private Account act;

    private Account act2;

    public Account getAct() {
        return act;
    }

    public void setAct(Account act) {
        this.act = act;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Account getAct2() {
        return act2;
    }

    public void setAct2(Account act2) {
        this.act2 = act2;
    }

  
    @Override
    public String toString() {
        return "Customer [custName=" + custName + ", age=" + age + ", act=" + act + ", act2=" + act2 + "]";
    }

    public void init() {
        this.age = 10;
        this.custName = "NONE";
        System.out.println("### INIT");
    }

    public void destroy() {
        this.age = 0;
        this.custName = "All is well";
        System.out.println("### Destroy");
    }


  
    
}
