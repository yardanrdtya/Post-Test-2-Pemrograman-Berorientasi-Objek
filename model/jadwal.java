/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class jadwal {
    // Properties (private)
    private String jenis;
    private String durasi;
    private String hari;

    // Constructor
    public jadwal(String jenis, String durasi, String hari) {
        this.jenis = jenis;
        this.durasi = durasi;
        this.hari = hari;
    }

    // Getter & Setter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    // Untuk tampilkan data
    @Override
    public String toString() {
        return jenis + " | " + durasi + " | " + hari;
    }
}
