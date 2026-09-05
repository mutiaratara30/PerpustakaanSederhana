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
    
 String judul;
 String penulis;
 int tahunTerbit; 
 
 Buku(String judul, String penulis, int tahunTerbit) {
    this.judul = judul;
    this.penulis = penulis;
    this.tahunTerbit = tahunTerbit;
    
}
 
 void tampilkanInfo() {
    System.out.println("=== DATA BUKU ===");
    System.out.println("Judul        : " + judul);
    System.out.println("Penulis      : " + penulis);
    System.out.println("Tahun Terbit : " + tahunTerbit);
}
}
