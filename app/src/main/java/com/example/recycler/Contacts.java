package com.example.recycler;

public class Contacts {
    private String name;
    private String phonenumber;
    private String address;
    private String email;
    private int imageid;

    public Contacts(String name, String phonenumber, String address, String email, int imageid) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
        this.email = email;
        this.imageid = imageid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }
}
