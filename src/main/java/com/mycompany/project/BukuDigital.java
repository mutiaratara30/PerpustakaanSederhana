/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TOSHIBA
 */
package com.mycompany.project;

public class BukuDigital extends Buku {

    private String formatFile;
    private double ukuranFile;

    public BukuDigital(String judul, String penulis, int tahunTerbit,
                       String formatFile, double ukuranFile) {

        super(judul, penulis, tahunTerbit);

        this.formatFile = formatFile;
        this.ukuranFile = ukuranFile;
    }

    public String getFormatFile() {
        return formatFile;
    }

    public void setFormatFile(String formatFile) {
        this.formatFile = formatFile;
    }

    public double getUkuranFile() {
        return ukuranFile;
    }

    public void setUkuranFile(double ukuranFile) {
        this.ukuranFile = ukuranFile;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Format File  : " + formatFile);
        System.out.println("Ukuran File  : " + ukuranFile + " MB");
    }
}