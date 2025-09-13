package Pertemuan4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete extends Koneksi {

    public static void delete() {
        Scanner sc = new Scanner(System.in);
        String sql = "DELETE FROM minuman WHERE id_minuman=?";
        char ulang;

        try (Connection conn = Koneksi.getConnection(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            do {
                System.out.print("ID Minuman yang akan dihapus: ");
                int id = sc.nextInt();

                ps.setInt(1, id);
                int rows = ps.executeUpdate();

                if (rows > 0) {
                    System.out.println("Data berhasil dihapus!");
                } else {
                    System.out.println("ID tidak ditemukan!");
                }

                System.out.print("Hapus data lagi? (Y/N): ");
                ulang = sc.next().charAt(0);

            } while (ulang == 'Y' || ulang == 'y');

        } catch (Exception e) {
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }
}
