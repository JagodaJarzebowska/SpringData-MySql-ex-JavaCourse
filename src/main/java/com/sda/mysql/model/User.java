package com.sda.mysql.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
public class User {

    @Id
    private long id;
    private String name;
    private String surename;
    private String nick;
    private String email;
    private String password;
    private UserStatus userStatus;
    private String textStatus;
    private Timestamp addTimeStamp;
    private Timestamp updateTimeStamp;
}
