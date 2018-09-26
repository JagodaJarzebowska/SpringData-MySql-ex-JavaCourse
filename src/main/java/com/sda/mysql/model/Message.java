package com.sda.mysql.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
public class Message {

    @Id
    private long id;
    private String sender;
    private String recipient;
    private String content;
    private MessageType messageType;
    private Status status;
    private Timestamp timestamp;

}
