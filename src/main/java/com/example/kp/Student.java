package com.example.kp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Student {
    private UUID id;
    private String first;
    private String last;
    private String num;
    private float av;

    public void setId(UUID id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID getId() {
        return id;
    }


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public float getAv() {
        return av;
    }

    public void setAv(float av) {
        this.av = av;
    }

    @Override
    public String toString() {
        return "student [id=" + id + ", first=" + first + ", last=" + last + ", num=" + num + ", av=" + av + "]";
    }
}