/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.jadwal;
/**
 *
 * @author USER
 */
public class crud {
    private ArrayList<jadwal> jadwalList = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    // Create
    public void tambah() {
        String jenis, durasi, hari;
        
        // Mengiput jenis
        do {
            System.out.print("Masukkan Jenis Olahraga: ");
            jenis = input.nextLine().trim();
            if (jenis.isEmpty()) {
                System.out.println("Input tidak boleh kosong!");
            }
        } while (jenis.isEmpty());
        
        // Menginput durasi
        do {
            System.out.print("Masukkan Durasi (contoh: 30 menit) : ");
            durasi = input.nextLine().trim();
            if (durasi.isEmpty()) {
                System.out.println("Input tidak boleh kosong!");
            }
        } while (durasi.isEmpty());
        
        // Menginput hari
        do {
            System.out.print("Masukkan Hari: ");
            hari = input.nextLine().trim();
            if (hari.isEmpty()) {
                System.out.println("Input tidak boleh kosong!");
            }
        } while (hari.isEmpty());
        
        // Menambahkan jadwal ke ArrayList
        jadwalList.add(new jadwal(jenis, durasi, hari));
        System.out.println("==== Jadwal olahraga berhasil ditambahkan! ====");
    }

    // Read
    public void lihat() {
        if (jadwalList.isEmpty()) {
            System.out.println("Belum ada jadwal yang tersimpan.");
        } else {
            System.out.println("\n|=========================================|");
            System.out.println("|         Daftar Jadwal Olahraga          |");
            System.out.println("|=========================================|");
            for (int i = 0; i < jadwalList.size(); i++) {
                System.out.println((i + 1) + ". " + jadwalList.get(i));
            }
        }
    }

    // Update
    public void update() {
        lihat();
        if (jadwalList.isEmpty()) return;

        System.out.print("Masukkan nomor jadwal yang akan diupdate: ");
        String inputIdx = input.nextLine();
        int idx;
        try {
            idx = Integer.parseInt(inputIdx) - 1;
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka!");
            return;
        }

        if (idx >= 0 && idx < jadwalList.size()) {
            String jenis, durasi, hari;
            
            // Menginput jadwal baru
            do {
                System.out.print("Masukkan Jenis Olahraga baru: ");
                jenis = input.nextLine().trim();
                if (jenis.isEmpty()) {
                    System.out.println("Input tidak boleh kosong!");
                }
            } while (jenis.isEmpty());
            
            // Menginput durasi baru
            do {
                System.out.print("Masukkan Durasi baru: ");
                durasi = input.nextLine().trim();
                if (durasi.isEmpty()) {
                    System.out.println("Input tidak boleh kosong!");
                }
            } while (durasi.isEmpty());
            
            // Menginput hari baru
            do {
                System.out.print("Masukkan Hari baru: ");
                hari = input.nextLine().trim();
                if (hari.isEmpty()) {
                    System.out.println("Input tidak boleh kosong!");
                }
            } while (hari.isEmpty());
            
            // Memperbarui jadwal di ArrayList
            jadwalList.set(idx, new jadwal(jenis, durasi, hari));
            System.out.println("==== Jadwal berhasil diupdate! ====");
        } else {
            System.out.println("Nomor tidak valid / tidak ada.");
        }
    }

    // Delete
    public void hapus() {
        lihat();
        if (jadwalList.isEmpty()) return;

        System.out.print("Masukkan nomor jadwal yang akan dihapus: ");
        String inputIdx = input.nextLine();
        int idx;
        try {
            idx = Integer.parseInt(inputIdx) - 1;
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka!");
            return;
        }

        if (idx >= 0 && idx < jadwalList.size()) {
            jadwalList.remove(idx);
            System.out.println("==== Jadwal berhasil dihapus! ====");
        } else {
            System.out.println("Nomor tidak valid / tidak ada.");
        }
    }

    // Nilai tambah: Search
    public void cari() {
        String keyword;
        
        // Menginput keyword untuk Searching
        do {
            System.out.print("Masukkan kata kunci (jenis/hari): ");
            keyword = input.nextLine().trim();
            if (keyword.isEmpty()) {
                System.out.println("Kata kunci tidak boleh kosong!");
            }
        } while (keyword.isEmpty());

        boolean found = false;
        for (jadwal j : jadwalList) {
            if (j.getJenis().toLowerCase().contains(keyword) || j.getHari().toLowerCase().contains(keyword)) {
                System.out.println(j);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Jadwal tidak ditemukan.");
        }
    }
}
