package Pertemuan5;

public class Diskon {
import java.util.Scanner;

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah pembelian Rp. = ");
        int jumlah_pembelian = input.nextInt();
        double potongan;
        if (jumlah_pembelian < 50000) {
            potongan = jumlah_pembelian * 0.05;
        } else {
            potongan = jumlah_pembelian * 0.2;
        }
        double jumlah_yang_harus_dibayarkan = jumlah_pembelian - potongan;
        System.out.println("Besarnya potongan Rp. " + potongan + " (otomatis)");
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jumlah_yang_harus_dibayarkan + " (otomatis)");
    }
}
