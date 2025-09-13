/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Insert extends Koneksi {

    public static void insert() {
        Scanner sc = new Scanner(System.in);
        char ulang;

        do {
            String sql = "INSERT INTO minuman (nama, kategori, harga, ukuran) VALUES (?, ?, ?, ?)";
            try (Connection conn = Koneksi.getConnection(); 
                 PreparedStatement ps = conn.prepareStatement(sql)) {

                System.out.print("Nama Minuman : ");
                String nama = sc.nextLine();
                System.out.print("Kategori (kopi, boba, matcha, dll) : ");
                String kategori = sc.nextLine();
                System.out.print("Harga : ");
                int harga = sc.nextInt();
                sc.nextLine();
                System.out.print("Ukuran (S/M/L) : ");
                String ukuran = sc.nextLine();

                ps.setString(1, nama);
                ps.setString(2, kategori);
                ps.setInt(3, harga);
                ps.setString(4, ukuran);

                ps.executeUpdate();
                System.out.println("Data berhasil ditambahkan!");
            } catch (Exception e) {
                System.out.println("Gagal insert: " + e.getMessage());
            }

            System.out.print("Tambah data lagi? (y/n): ");
            ulang = sc.next().charAt(0);
            sc.nextLine(); // buang enter biar tidak lompat input
        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Kembali ke menu utama...");
    }
}
