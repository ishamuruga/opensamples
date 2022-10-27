package com.payment.springcore.beans;

public class AnotherObject {
    
    private Account act;

    private Statement stmt1;
    
    AnotherObject(Account _act, Statement _stmt){
        this.act = _act;
        this.stmt1 = _stmt;
    }

    public Account getAct() {
        return act;
    }

    public void setAct(Account act) {
        this.act = act;
    }

    public Statement getStmt1() {
        return stmt1;
    }

    public void setStmt1(Statement stmt1) {
        this.stmt1 = stmt1;
    }

    @Override
    public String toString() {
        return "AnotherObject [act=" + act + ", stmt1=" + stmt1 + "]";
    }

    
    
}
