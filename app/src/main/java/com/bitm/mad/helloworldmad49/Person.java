package com.bitm.mad.helloworldmad49;

public class Person {
    private String Name;
    private String Phone;
    private String Email;
    private String City;


    public Person(String name, String phone, String email, String city) {
        Name = name;
        Phone = phone;
        Email = email;
        City = city;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Email='" + Email + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}
