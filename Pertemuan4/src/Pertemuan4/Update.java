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
public class Update extends Koneksi {

    public static void update() {
        Scanner sc = new Scanner(System.in);
        String sql = "UPDATE minuman SET nama=?, kategori=?, harga=?, ukuran=? WHERE id_minuman=?";
        char ulang;

        try (Connection conn = Koneksi.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            do {
                System.out.print("ID Minuman yang akan diupdate: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Nama baru : ");
                String nama = sc.nextLine();
                System.out.print("Kategori baru : ");
                String kategori = sc.nextLine();
                System.out.print("Harga baru : ");
                int harga = sc.nextInt();
                sc.nextLine();
                System.out.print("Ukuran baru (S/M/L) : ");
                String ukuran = sc.nextLine();

                ps.setString(1, nama);
                ps.setString(2, kategori);
                ps.setInt(3, harga);
                ps.setString(4, ukuran);
                ps.setInt(5, id);

                int rows = ps.executeUpdate();
                if (rows > 0) {
                    System.out.println("Data berhasil diupdate!");
                } else {
                    System.out.println("ID tidak ditemukan!");
                }

                System.out.print("Update data lagi? (Y/N): ");
                ulang = sc.next().charAt(0);

            } while (ulang == 'Y' || ulang == 'y');
        } catch (Exception e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }
}
