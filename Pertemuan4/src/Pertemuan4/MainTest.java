/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MainTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU DATABASE MINUMAN KEKINIAN ===");
            System.out.println("1. Create Table");
            System.out.println("2. Insert Data");
            System.out.println("3. Update Data");
            System.out.println("4. Delete Data");
            System.out.println("5. Select Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    Create.create();
                    break;

                case 2:
                    Insert.insert();
                    break;

                case 3:
                    Update.update();
                    break;

                case 4:
                    Delete.delete();
                    break;

                case 5:
                    Select.select();
                    break;

                case 0:
                    System.out.println("Keluar program...");
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}