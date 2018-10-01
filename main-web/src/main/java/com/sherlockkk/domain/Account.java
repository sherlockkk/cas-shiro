package com.sherlockkk.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double balance;

}
