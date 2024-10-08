package com.example.kp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String troupe;
    private String date;
    private Integer total_tickets;
    private Integer free_tickets;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTroupe() {
        return troupe;
    }

    public void setTroupe(String troupe) {
        this.troupe = troupe;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTotal_tickets() {
        return total_tickets;
    }

    public void setTotal_tickets(Integer total_tickets) {
        this.total_tickets = total_tickets;
    }

    public Integer getFree_tickets() {
        return free_tickets;
    }

    public void setFree_tickets(Integer free_tickets) {
        this.free_tickets = free_tickets;
    }


    @Override
    public String toString() {
        return "theatre [id=" + id + ", name=" + name + ", troupe=" + troupe + ", date=" + date +
                ", total_tickets=" + total_tickets + ", free_tickets=" + free_tickets + "]";
    }
}