package com.example.Trqyvjnixqfmmyvabznc.dto;

public class UserMongoDTO {
    String id;
    String name;
    String phoneNumber1;
    String PhoneNumber2;
    String yearOfBirth;
    String date;

    public UserMongoDTO() {
    }

    public UserMongoDTO(String id, String name, String phoneNumber1, String phoneNumber2, String yearOfBirth, String date) {
        this.id = id;
        this.name = name;
        this.phoneNumber1 = phoneNumber1;
        PhoneNumber2 = phoneNumber2;
        this.yearOfBirth = yearOfBirth;
        this.date = date;
    }

    public UserMongoDTO(String name, String phoneNumber1, String phoneNumber2, String yearOfBirth) {
        this.name = name;
        this.phoneNumber1 = phoneNumber1;
        PhoneNumber2 = phoneNumber2;
        this.yearOfBirth = yearOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
