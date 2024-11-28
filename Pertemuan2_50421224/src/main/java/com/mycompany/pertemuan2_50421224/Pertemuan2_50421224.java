/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan2_50421224;

/**
 *
 * @author mita
 */
public class Pertemuan2_50421224 {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Aryama", "50421224", 21);
        mahasiswa.tampilkanData();
        System.out.println();
        
        MahasiswaSarjana mahasiswaSarjana = new MahasiswaSarjana("Indah", "50421653", 21, "Informatika");
        mahasiswaSarjana.tampilkanData();
        System.out.println();
    }
}
