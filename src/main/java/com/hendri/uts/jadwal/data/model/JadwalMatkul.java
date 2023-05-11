/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hendri.uts.jadwal.data.model;

import com.hendri.uts.jadwal.data.model.Jadwal;
import com.hendri.uts.jadwal.data.model.Jadwal;
import java.util.ArrayList;

/**
 *
 * @author HENDRIYAWAN
 * NIM   :211011401536
 * KELAS :04TPLK002
 */
abstract class JadwalMatkul {
    ///untuk logic / operasi tambah, update, lihat data
    public void tambahJadwal(Jadwal jadwal){}
    public void updateJadwal(int position, Jadwal jadwal){}
    public void hapusJadwal(int position){}
    public Jadwal lihatJadwal(int position){
        return null;
    }
    public ArrayList<Jadwal> lihatSemuaJadwal(){
        return null;
    }
    
}
