/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.toko_online;

public class Main {
    public static void main(String[] args) {
        Member member = new Member();
        Karyawan karyawan = new Karyawan();
        Barang barang = new Barang();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();

        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);
        
        transaksi.prosesTransaksi(member, transaksi, barang);
        
        laporan.laporan(transaksi, barang);
        laporan.laporan(barang);
        laporan.laporan(member);
    }
}