package com.mycompany.api.mycompanyapi.uimodel;

import java.util.Date;

public class ErrorResponse {
    private int id;

    private String message;

    public ErrorResponse(int id, String message, Date date) {
        this.id = id;
        this.message = message;
        this.date = date;
    }

    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
