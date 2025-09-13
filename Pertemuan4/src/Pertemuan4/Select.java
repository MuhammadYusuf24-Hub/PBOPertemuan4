/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author LENOVO
 */
public class Select extends Koneksi {

    public static void select() {
        String sql = "SELECT * FROM minuman";
        try (Connection conn = Koneksi.getConnection(); 
             Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("===== Data Minuman Kekinian =====");
            
            if (!rs.isBeforeFirst()) {
                System.out.println("Belum ada data di tabel minuman.");
                return; // langsung keluar
            }

            // tampilkan header kolom
            System.out.printf("%-5s | %-15s | %-10s | %-10s | %-5s%n",
                    "ID", "Nama", "Kategori", "Harga", "Ukuran");
            System.out.println("------------------------------------------------------------");

            // tampilkan isi tabel
            while (rs.next()) {
                int id = rs.getInt("id_minuman");
                String nama = rs.getString("nama");
                String kategori = rs.getString("kategori");
                int harga = rs.getInt("harga");
                String ukuran = rs.getString("ukuran");

                System.out.printf("%-5d | %-15s | %-10s | %-10d | %-5s%n",
                        id, nama, kategori, harga, ukuran);
            }
        } catch (Exception e) {
            System.out.println("Gagal select: " + e.getMessage());
        }
    }
}
