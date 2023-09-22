package com.javalatihan1;


public class Helper {
    public static int getUmur(Mahasiswa m) {
        int umur;
        int bulanSekarang = (2003 * 12) + 9;
        int bulanLahir = m.getTanggalLahir().getYear()*12 + m.getTanggalLahir().getMonth();
        umur = bulanSekarang - bulanLahir;
        return umur;
    }
}
