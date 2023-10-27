package com.example.Trqyvjnixqfmmyvabznc.dto;

public class UserDTO {
    int id;
    private String name;
    private String phoneNumber1;
    private String PhoneNumber2;
    private String yearOfBirth;
    private String date;


    public UserDTO() {
    }

    public UserDTO(int id, String name, String phoneNumber1, String phoneNumber2, String yearOfBirth, String date) {
        this.id = id;
        this.name = name;
        this.phoneNumber1 = phoneNumber1;
        PhoneNumber2 = phoneNumber2;
        this.yearOfBirth = yearOfBirth;
        this.date = date;
    }

    public UserDTO(String name, String phoneNumber1, String phoneNumber2, String yearOfBirth) {
        this.name = name;
        this.phoneNumber1 = phoneNumber1;
        PhoneNumber2 = phoneNumber2;
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

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return PhoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        PhoneNumber2 = phoneNumber2;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
