package com.syavelanisrina.projectakhirpbo;

import javax.swing.*;
import java.awt.*;

public class StrukTiket extends JFrame {
    private String nama;
    private String telepon;
    private String asal;
    private String tujuan;
    private String tanggal;
    private String namaKereta;
    private int harga;
    private int jumlahPenumpang;

    public StrukTiket(String nama, String telepon, String asal, String tujuan, String tanggal, String namaKereta, int harga, int jumlahPenumpang) {
        this.nama = nama;
        this.telepon = telepon;
        this.asal = asal;
        this.tujuan = tujuan;
        this.tanggal = tanggal;
        this.namaKereta = namaKereta;
        this.harga = harga;
        this.jumlahPenumpang = jumlahPenumpang;

        initComponents();
    }

    private void initComponents() {
        setTitle("Struk Tiket");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextArea strukTextArea = new JTextArea();
        strukTextArea.setEditable(false);
        strukTextArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

        // Format isi struk tiket
        int totalHarga = harga * jumlahPenumpang;
        StringBuilder receipt = new StringBuilder();
        receipt.append("=========================================\n");
        receipt.append(String.format("%20s\n", "RECEIPT"));
        receipt.append("=========================================\n");
        receipt.append(String.format("Nama Penumpang : %-20s\n", nama));
        receipt.append(String.format("Telepon        : %-20s\n", telepon));
        receipt.append(String.format("Tanggal        : %-20s\n", tanggal));
        receipt.append("-----------------------------------------\n");
        receipt.append(String.format("Asal           : %-20s\n", asal));
        receipt.append(String.format("Tujuan         : %-20s\n", tujuan));
        receipt.append(String.format("Kereta         : %-20s\n", namaKereta));
        receipt.append("-----------------------------------------\n");
        receipt.append(String.format("Harga Satuan   : Rp %-18s\n", String.format("%,d", harga)));
        receipt.append(String.format("Jumlah Penumpang: %-18s\n", jumlahPenumpang));
        receipt.append(String.format("Total Harga    : Rp %-18s\n", String.format("%,d", totalHarga)));
        receipt.append("=========================================\n");
        receipt.append(String.format("%30s\n", "THANK YOU FOR YOUR PURCHASE!"));
        receipt.append("=========================================\n");

        strukTextArea.setText(receipt.toString());

        JScrollPane scrollPane = new JScrollPane(strukTextArea);
        JButton closeButton = new JButton("Close");

        closeButton.addActionListener(e -> dispose());

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(closeButton, BorderLayout.SOUTH);

        add(panel);
    }

    public static void main(String[] args) {
        // Contoh data untuk tes
        SwingUtilities.invokeLater(() -> new StrukTiket(
                "ilhamkurniada",
                "081280714439",
                "Bandung",
                "Jakarta",
                "12-12-2024",
                "Kereta Papandayan",
                500000,
                2
        ).setVisible(true));
    }
}
