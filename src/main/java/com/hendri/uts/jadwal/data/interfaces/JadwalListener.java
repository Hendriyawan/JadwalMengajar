/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hendri.uts.jadwal.data.interfaces;

/**
 *
 * @author HENDRIYAWAN
 * NIM   :211011401536
 * KELAS :04TPLK002
 */
public interface JadwalListener {
    void onAdd(String message);
    void onUpdate(String message);
    void onDelete(String message);
}
