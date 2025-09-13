/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author LENOVO
 */
public class Create extends Koneksi {

    public static void create() {
        String sql = "CREATE TABLE minuman ("
                + "id_minuman SERIAL PRIMARY KEY,"
                + " nama VARCHAR(100),"
                + " kategori VARCHAR(50),"
                + " harga INT,"
                + " ukuran VARCHAR(10))";
        try (Connection conn = Koneksi.getConnection(); 
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabel 'minuman' berhasil dibuat!");
        } catch (Exception e) {
            System.out.println("Gagal membuat tabel: " + e.getMessage());
        }
    }
}
