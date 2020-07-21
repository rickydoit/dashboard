package com.myspring.dashboard.entity;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;
}
