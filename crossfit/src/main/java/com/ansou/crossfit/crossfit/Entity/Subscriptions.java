package com.ansou.crossfit.crossfit.Entity;

import javax.persistence.*;

@Entity
public class Subscriptions {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public Subscriptions() {
    }
}
