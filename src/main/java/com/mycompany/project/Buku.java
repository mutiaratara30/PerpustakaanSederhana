/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author TOSHIBA
 */
public class Buku {
    
 private String judul;
 private String penulis;
 private int tahunTerbit; 
 
 Buku(String judul, String penulis, int tahunTerbit) {
    this.judul = judul;
    this.penulis = penulis;
    this.tahunTerbit = tahunTerbit;
 }
    public String getJudul() {
    return judul;
}

public String getPenulis() {
    return penulis;
}

public int getTahunTerbit() {
    return tahunTerbit;
}

public void setJudul(String judul) {
    this.judul = judul;
}

public void setPenulis(String penulis) {
    this.penulis = penulis;
}

public void setTahunTerbit(int tahunTerbit) {
    if (tahunTerbit >= 0) {
        this.tahunTerbit = tahunTerbit;
    } else {
        System.out.println("Tahun terbit tidak boleh negatif.");
    }
}
    
 
 void tampilkanInfo() {
    System.out.println("=== DATA BUKU ===");
    System.out.println("Judul        : " + judul);
    System.out.println("Penulis      : " + penulis);
    System.out.println("Tahun Terbit : " + tahunTerbit);
}
}
