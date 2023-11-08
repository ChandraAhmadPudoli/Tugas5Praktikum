package Pertemuan5;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nama : ");
        String nama = input .nextLine();
        System.out.println("Masukan Prodi : "); 
        String prodi = input .nextLine();    
        System.out.println("Masukan NPM : ");
        String NPM = input .nextLine();
        System.out.println("Masukan Semester : ");
        int semester = input .nextInt();

        System.out.println("Nama Saya Adalah : "+nama);    
        System.out.println("Prodi : "+prodi);
        System.out.println("NPM : "+NPM);
        System.out.println("Semester : "+semester);

        
    }
}

