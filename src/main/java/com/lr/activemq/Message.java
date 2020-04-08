package com.lr.activemq;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    private String context;
    private Date sendDate;

    @Override
    public String toString() {
        return "Message{" +
                "context='" + context + '\'' +
                ", sendDate=" + sendDate +
                '}';
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}
