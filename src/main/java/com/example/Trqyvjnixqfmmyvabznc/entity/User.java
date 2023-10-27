package com.example.Trqyvjnixqfmmyvabznc.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "name")
    private String name;
    @Column(name = "yearOfBirth")
    private String yearOfBirth;
    @Column(name = "phoneNumber1")
    private String phoneNumber1;
    @Column(name = "phoneNumber2")
    private String phoneNumber2;
    @Column(name = "date")
    private String date;

    public User(int id, String name, String yearOfBirth, String phoneNumber1, String phoneNumber2, String date) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.date = date;
    }

    public User() {
    }

    public User(String date, String name, String phoneNumber1, String phoneNumber2, String yearOfBirth) {
        this.date = date;
        this.name = name;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
