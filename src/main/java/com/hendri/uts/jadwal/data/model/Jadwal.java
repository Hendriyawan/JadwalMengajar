/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hendri.uts.jadwal.data.model;

/**
 *
 * @author HENDRIYAWAN
 * NIM   :211011401536
 * KELAS :04TPLK002
 */
public class Jadwal extends JadwalMatkul {
    private Dosen dosen;
    private String matkul;
    private String jam;
    private String ruangan;
    private String sks;
    
    public Jadwal(Dosen dosen, String matkul, String jam, String ruangan, String sks){
        this.dosen = dosen;
        this.matkul = matkul;
        this.jam = jam;
        this.ruangan = ruangan;
        this.sks = sks;
    }
    
    /**
     * getter
     * method untuk mengembalikan dosen dari object Jadwal
     * @return Dosen dosen
     */
    public Dosen getDosen(){
        return dosen;
    }
    
    /**
     * getter
     * method untuk mengembalikan matkul dari object Jadwal
     * @return String matkul
     */
    public String getMatkul(){
        return matkul;
    }
    
    /**
     * getter
     * method untuk mengembalikan jam dari object Jadwal
     * @return String jam
     */
    public String getJam(){
        return jam;
    }
    
    /**
     * getter
     * method untuk mengembalikan ruangan dari object Dosen
     * @return String ruangan
     */
    public String getRuangan(){
        return ruangan;
    }
    
    /**
     * getter
     * method untuk mengembalikan sks dari object Dosen
     * @return String sks;
     */
    public String getSks(){
        return sks;
    }
}
