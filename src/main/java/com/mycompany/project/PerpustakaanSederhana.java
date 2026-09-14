/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author TOSHIBA
 */
public class PerpustakaanSederhana {
    
    public static void main(String[] args) {
        
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        
        buku1.setJudul("Bumi");
        buku1.setPenulis("Tere Liye");
        buku1.setTahunTerbit(2014);
        
        buku1.tampilkanInfo();
        
        System.out.println("Judul melalui Getter : " + buku1.getJudul());
        System.out.println("Penulis melalui Getter : " + buku1.getPenulis());
        System.out.println("Tahun melalui Getter : " + buku1.getTahunTerbit());

}
}
