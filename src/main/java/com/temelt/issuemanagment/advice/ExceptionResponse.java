package com.temelt.issuemanagment.advice;

import lombok.Data;

import java.util.Date;

public class ExceptionResponse {
    private Date date;
    private String message;


    public ExceptionResponse() {
    }
    public ExceptionResponse(Date date, String message) {
        this.date = date;
        this.message = message;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
