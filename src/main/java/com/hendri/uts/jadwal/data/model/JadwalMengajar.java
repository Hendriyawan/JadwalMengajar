/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hendri.uts.jadwal.data.model;

import com.hendri.uts.jadwal.data.interfaces.JadwalListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author HENDRIYAWAN
 * NIM   :211011401536
 * KELAS :04TPLK002
 */
public class JadwalMengajar extends JadwalMatkul {
    private ArrayList<Jadwal> listJadwal = new ArrayList<Jadwal>(
            Arrays.asList(
                    new Jadwal(new Dosen("AHMAD SANTOSO", "111", "L", "TI"), "BASIS DATA", "07:00 - 09:00", "1", "1"),
                    new Jadwal(new Dosen("AHMAD JALALUDIN", "222", "L", "TI"),"PEMROGRAMAN 2", "09:00 - 10:00", "1", "2"),
                    new Jadwal(new Dosen("TIA MAHARINI", "333", "P", "TI"), "PENGANTAR APLIKASI","10:00 - 12:00", "1", "2"),
                    new Jadwal(new Dosen("AHMAD SUSILO", "444", "L", "TI"), "B INGRISS", "13:00 - 14:00", "1", "1"),
                    new Jadwal(new Dosen("AHMAD SIGIT", "555", "L", "TI"), "JARINGAN KOMPUTER","14:00 - 15:00", "1", "1")
            )
    );
    private JadwalListener jadwalListener;
    
    public void setJadwalListener(JadwalListener jadwalListener){
        this.jadwalListener = jadwalListener;
    }
    
    @Override
    public void tambahJadwal(Jadwal jadwal) {
        listJadwal.add(jadwal);
        jadwalListener.onAdd("Berhasil menambahkan jadwal baru !");
    }

    @Override
    public void updateJadwal(int position, Jadwal jadwal) {
        try {
            listJadwal.set(position, jadwal);
            jadwalListener.onUpdate("Berhasil mengupdate jadwal baru !");
        } catch (Exception e){
            jadwalListener.onUpdate("Gagal mengupdate data !");
        }
    }
    
    @Override
    public void hapusJadwal(int position){
        try {
            listJadwal.remove(position);
            jadwalListener.onDelete("Berhasil menghapus jadwal !");
        } catch (Exception e){
            jadwalListener.onDelete("Gagal menghapus jadwal !");
        }
    }
    @Override
    public  Jadwal lihatJadwal(int position) {
        return listJadwal.get(position);
    }
    
    @Override
    public ArrayList<Jadwal> lihatSemuaJadwal(){
        return listJadwal;
    }
    
}
