/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class Koneksi {

    static final String URL = "jdbc:postgresql://localhost:5432/PBO";
    static final String USER = "postgres"; // ganti sesuai user PostgreSQL
    static final String PASSWORD = "admin"; // ganti sesuai password PostgreSQL

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi ke PostgreSQL berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }
}


