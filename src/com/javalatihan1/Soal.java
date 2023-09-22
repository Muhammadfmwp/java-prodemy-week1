package com.javalatihan1;

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

        Mahasiswa mhs1 = new Mahasiswa("123123","Satrio", new MyDate(2,3,2002));
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs2.setNama("Rose");
        mhs2.setNim("12312");
        mhs2.setTanggalLahir(new MyDate(11,2,2014));

        mhs3.setNama("Test");
        mhs3.setNim("3123123");
        mhs3.setTanggalLahir(new MyDate(20,5,2001));

        Mahasiswa[] umurMhs = {mhs1, mhs2, mhs3};

        System.out.print("Umur mahasiswa yang ada :");
        for (Mahasiswa umur: umurMhs){
            System.out.print(umur.getUmur());
        }

        System.out.println();
        Mahasiswa mahasiswaTermuda = null;
        int umurTermuda = umurMhs[0].getUmur();
        for (int i = 0; i < umurMhs.length; i ++){
            if (umurTermuda > umurMhs[i].getUmur()){
                mahasiswaTermuda = umurMhs[i];
            }
        }

        System.out.print("Umur termuda dari mahasiswa adalah \n" + mahasiswaTermuda);
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
