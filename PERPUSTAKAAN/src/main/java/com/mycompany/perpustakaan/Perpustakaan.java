/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaan;

/**
 *
 * @author avicomp
 */
public interface Perpustakaan {
    void pinjamBuku(String judulBuku);
    void kembalikanBuku(String judulBuku);
    void lihatDaftarBuku();
}