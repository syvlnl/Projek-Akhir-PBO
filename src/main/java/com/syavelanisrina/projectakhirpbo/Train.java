package com.syavelanisrina.projectakhirpbo;

public class Train {
    private String nametrain;
    private double price;
    private String departure;
    private String arrivetime;

    public Train(String nametrain, double price, String departure, String arrivetime) {
        this.nametrain = nametrain;
        this.price = price;
        this.departure = departure;
        this.arrivetime = arrivetime;
    }

    public String getNametrain() {
        return nametrain;
    }

    public double getPrice() {
        return price;
    }

    public String getDeparture() {
        return departure;
        System.out.println("he");
    }

    public String getArrivetime() {
        return arrivetime;
    }
}
