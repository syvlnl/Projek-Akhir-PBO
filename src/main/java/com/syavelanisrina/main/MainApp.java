package com.syavelanisrina.main;

import com.syavelanisrina.projectakhirpbo.DetailPemesanan;

public class MainApp {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailPemesanan().setVisible(true);
            }
        });
    }
}
