package com.syavelanisrina.projectakhirpbo;

public class Order {
    private String name;
    private String email;
    private int phonenumber;
    private int idnumber;

    public Order(String name, String email, int phonenumber) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.idnumber = idnumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public int getIdnumber() {
        return idnumber;
    }
}
