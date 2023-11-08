package Pertemuan5;

import java.util.Scanner;

public class Potongan {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Jumlah pembelian Rp. = ");
        int jumlah_harga_pembelian = input.nextInt();

        double potongan;
        
        if (jumlah_harga_pembelian < 50000) {
            potongan = jumlah_harga_pembelian * 0.05;
    } else {
            potongan = jumlah_harga_pembelian * 0.2;
    }
    
        double jumlah_yang_harus_dibayarkan = jumlah_harga_pembelian - potongan;

        System.out.println("Besar Potongannya Rp. = " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. = " + jumlah_yang_harus_dibayarkan);
    } 
}

