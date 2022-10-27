package com.payment.springcore.beans;

import java.util.List;
import java.util.Map;

public class Account extends BaseBean{

    Account(){
        System.out.println("Account Bean is getting Created....");
    }

    private String accNbr;

    private AccountType aType;

    private List<Statement> statements;

    private Map<String,?> myMaps;

    public Map<String, ?> getMyMaps() {
        return myMaps;
    }

    public void setMyMaps(Map<String, ?> myMaps) {
        this.myMaps = myMaps;
    }

    private List anyObjects;

    public String getAccNbr() {
        return accNbr;
    }

    public List getAnyObjects() {
        return anyObjects;
    }

    public void setAnyObjects(List anyObjects) {
        this.anyObjects = anyObjects;
    }

    public void setAccNbr(String accNbr) {
        this.accNbr = accNbr;
    }

    public AccountType getaType() {
        return aType;
    }

    public void setaType(AccountType aType) {
        this.aType = aType;
    }



    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "Account [accNbr=" + accNbr + ", aType=" + aType + ", statements=" + statements + "]";
    }

    
}
