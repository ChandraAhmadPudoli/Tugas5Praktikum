package Pertemuan5;

import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NPM : ");
        String npm = input.nextLine();

        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Nilai Kehadiran : ");
        double kehadiran = input.nextDouble();

        System.out.print("Nilai Tugas : ");
        double tugas = input.nextDouble();

        System.out.print("Nilai UTS : ");
        double uts = input.nextDouble();

        System.out.print("Nilai UAS : ");
        double uas = input.nextDouble();

        double nilaiAkhir = (0.1 * kehadiran) + (0.2 * tugas) + (0.3 * uts) + (0.4 * uas);
        String grade = "";
        String keterangan = "";

        if (nilaiAkhir >= 76) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46) {
            grade = "D";
            keterangan = "KURANG";
        } else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }

        System.out.println("\nNPM Mahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}

