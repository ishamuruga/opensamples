package com.corejava.aggregation;

import java.util.List;

public class Bank {
    //Aggregation

    private List<BaseEmployee> employees;

    public List<BaseEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<BaseEmployee> employees) {
        this.employees = employees;
    }

    private List<BaseValult> cValuts;
}
