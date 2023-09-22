package com.javalatihan1;

import com.sun.security.jgss.GSSUtil;

import java.time.*;
public class HitungUmur {

    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1 = new Mahasiswa("123123","Satrio", new MyDate(2,3,2002));
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs2.setNama("Rose");
        mhs2.setNim("12312");
        mhs2.setTanggalLahir(new MyDate(11,2,2014));

        mhs3.setNama("Test");
        mhs3.setNim("3123123");
        mhs3.setTanggalLahir(new MyDate(20,5,2001));

        System.out.println(mhs1.toString());
        System.out.println(mhs2.toString());
        System.out.println(mhs3.toString());

        System.out.println("===================");
        System.out.println(cetakUmur(mhs1));

        int[] array1 = {1,8,5,6,7,3,7,10};

        System.out.println("Latihan dengan array");
        System.out.print("Berikut adalah deret angka pada array: ");
        for (int angka: array1){
            System.out.print(angka);
        }
        System.out.println();


        //Print array dari yang terkecil
        urutTerkecil(array1);
        System.out.print("Array terurut dari yang terkecil:");
        for (int angka: array1) {
            System.out.print(angka);
        }
        System.out.println();

        // Print Array dari yang terbesar
        urutTerbesar(array1);
        System.out.print("Array terurut dari yang terkecil:");
        for (int angka: array1) {
            System.out.print(angka);
        }
        System.out.println();
        int bilanganTerkecil = array1[0];
        for (int j = 0 ; j < array1.length; j++) {
            if (bilanganTerkecil > array1[j]) {
                bilanganTerkecil = array1[j];
            }
        }

        System.out.println("Bilangan terkecil dari array 1 adalah " + bilanganTerkecil);

        int bilanganTerbesar = array1[0];
        for (int j = 0 ; j < array1.length; j++) {
            if (bilanganTerbesar < array1[j]) {
                bilanganTerbesar = array1[j];
            }

        }

        System.out.println("Bilangan terbesar dari array 1 adalah " + bilanganTerbesar);

        Mahasiswa[] umurMhs = {mhs1, mhs2, mhs3};

        System.out.print("Umur mahasiswa yang ada :");
        for (Mahasiswa umur: umurMhs){
            System.out.print(umur.getUmur());
        }

        System.out.println();
        int umurTermuda = umurMhs[0].getUmur();
        for (int i = 0; i < umurMhs.length; i ++){
            if (umurTermuda > umurMhs[i].getUmur()){
                umurTermuda = umurMhs[i].getUmur();
            }
        }

        System.out.print("Umur termuda dari mahasiswa adalah " + umurTermuda);
    }

    public static String cetakUmur(Mahasiswa mhs) {
        LocalDate currentdate = LocalDate.now();
        int tahunIni = currentdate.getYear();
        int bulanIni = currentdate.getMonthValue();
        int bulanSekarang = (tahunIni * 12) + bulanIni;
        int bulanLahir = (mhs.getTanggalLahir().getYear()*12) + mhs.getTanggalLahir().getMonth();
        int umurBulan = bulanSekarang - bulanLahir;
        String result = "Umur " + mhs.getNama() + " adalah " + (umurBulan/12) + " tahun " + (umurBulan%12) + " bulan ";
        return result;
    }



    private static int[] urutTerkecil(int[] array){
        int tukar;
        for (int j = 0 ; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    tukar = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tukar;
                }

            }
        }
        return array;
    }

    private static int[] urutTerbesar(int[] array){
        int tukar;
        for (int j = 0 ; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] < array[i + 1]) {
                    tukar = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tukar;
                }

            }
        }
        return array;
    }

}
