package com.myapplicationdev.android.democustomcontactlist;

public class Contact {
    private String name;
    private int countryCode;
    private int phoneNum;
    private char gender;

    public Contact(String name, int countryCode, int phoneNum, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public int getGender() {
        return gender;
    }

    public void setName() {
        this.name = name;
    }

    public void setCountryCode() {
        this.countryCode = countryCode;
    }

    public void setPhoneNum() {
        this.phoneNum = phoneNum;
    }

    public void setGender() {
        this.gender = gender;
    }
}
