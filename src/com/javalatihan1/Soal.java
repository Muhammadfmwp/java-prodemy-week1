package com.javalatihan1;

import java.util.Arrays;

public class Soal {
    public static void main(String[] args) throws Exception {


        int[] array1 = {1,8,5,6,7,3,7,9};

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
        System.out.print("Array terurut dari yang terkebesar:");
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

        Mahasiswa mhs1 = new Mahasiswa("123123","Satrio", new MyDate(2,3,2010));
        Mahasiswa mhs2 = new Mahasiswa("123113","Rose", new MyDate(4,5,2002));
        Mahasiswa mhs3 = new Mahasiswa("191004","Marie",new MyDate(6,18,2005));





        Mahasiswa mhs4 = new Mahasiswa("19123133","Radyan", new MyDate(5,8,2012));
        Mahasiswa mhs5 = new Mahasiswa("20131113","Disa", new MyDate(19,11,2006));

        Mahasiswa[] kumpulanMhs = {mhs1, mhs2, mhs3, mhs4, mhs5};

        System.out.println("=========================");

        System.out.println("Mahasiswa yang ada :");
        for (Mahasiswa umur: kumpulanMhs){
            System.out.print(umur);
        }
        System.out.println();
        System.out.println("===========Soal Mahasiswa==============");

        System.out.println();
        Mahasiswa mahasiswaTermuda = kumpulanMhs[0];
        int umurTermuda = Helper.getUmur(kumpulanMhs[0]);
        for (int i = 0; i < kumpulanMhs.length; i++){
            Mahasiswa m = kumpulanMhs[i];
            if (umurTermuda > Helper.getUmur(m)){
                mahasiswaTermuda = m;
            }
        }


        System.out.print("Mahasiswa termuda dari kumpulan mahasiswa adalah \n" + mahasiswaTermuda);
        System.out.println();


        // Tugas
        System.out.println("===========Tugas==============");
        Mahasiswa dataWadahMahasiswa = kumpulanMhs[0];
        int mhsTermuda = Helper.getUmur(kumpulanMhs[0]);
        for (int i = 0; i < kumpulanMhs.length; i++){
            for (int j = i+1; j < kumpulanMhs.length;j++)
                if (Helper.getUmur(kumpulanMhs[i]) > Helper.getUmur(kumpulanMhs[j])){
                    dataWadahMahasiswa = kumpulanMhs[i];
                    kumpulanMhs[i] = kumpulanMhs[j];
                    kumpulanMhs[j] = dataWadahMahasiswa;
                }
        }
        System.out.println("Urutan mahasiswa dari yang termuda adalah");


        for (Mahasiswa m: kumpulanMhs) {
            System.out.println(m);
        }
    }

    private static int[] urutTerkecil(int[] array) {
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

    private static int[] urutTerbesar(int[] array) {
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
