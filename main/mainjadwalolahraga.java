/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import java.util.Scanner;
import service.crud;

/**
 *
 * @author USER
 */
public class mainjadwalolahraga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        crud service = new crud();
        int pilihan;

        do {
            System.out.println("\n|=========================================|");
            System.out.println("|    Manajemen Jadwal Olahraga Pribadi    |");
            System.out.println("|=========================================|");
            System.out.println("| [1]. Tambah Jadwal Olahraga             |");
            System.out.println("| [2]. Lihat Jadwal Olahraga              |");
            System.out.println("| [3]. Update Jadwal Olahraga             |");
            System.out.println("| [4]. Hapus Jadwal Olahraga              |");
            System.out.println("| [5]. Search Jadwal Olahraga             |");
            System.out.println("| [6]. Keluar                             |");
            System.out.println("|=========================================|");
            System.out.print("Pilih menu (1/2/3/4/5/6): ");
            String inputMenu = input.nextLine();
            try {
                pilihan = Integer.parseInt(inputMenu);
            } catch (NumberFormatException e) {
                pilihan = -1;
            }

            switch (pilihan) {
                case 1: service.tambah(); break;
                case 2: service.lihat(); break;
                case 3: service.update(); break;
                case 4: service.hapus(); break;
                case 5: service.cari(); break;
                case 6: System.out.println("==== Baiklah, terima kasih sudah menggunakan program ini ^-^ ===="); break;           
                default: System.out.println("Pilihan tidak tersedia, silahkan coba lagi.");
            }
        } while (pilihan != 6);
        
        input.close();
        
    }
}
