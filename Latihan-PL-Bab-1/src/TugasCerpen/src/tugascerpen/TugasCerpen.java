package tugascerpen;

import java.util.Scanner;

public class TugasCerpen {

    static Scanner in = new Scanner(System.in);
    static Scanner masukan = new Scanner(System.in);
    static String nim[] = new String[5000000];
    static String nama[] = new String[5000000];
    static int jumlah[] = new int[5000000];

    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Mahasiswa/i : ");
        int x = in.nextInt();
        Data Mahasiswa[] = new Data[x];
        for (int i = 0; i < Mahasiswa.length; i++) {
            Mahasiswa[i] = new Data();
            System.out.println("Data Mahasiswa/i "+(i+1));
            System.out.print("Masukkan NIM                 : ");
            nim[i] = in.next();
            System.out.print("Masukkan Nama                : ");
            nama[i] = masukan.nextLine();
            System.out.print("Masukkan Jumlah Kata/Halaman : ");
            jumlah[i] = in.nextInt();

            Mahasiswa[i].Nim(nim[i]);
            Mahasiswa[i].Nama(nama[i]);
            Mahasiswa[i].JumlahKata(jumlah[i]);

        }
        for (int i = 0; i < Mahasiswa.length; i++) {
            System.out.println("Data Mahasiswa/i "+(i+1));
            System.out.println("Nim                   : " + Mahasiswa[i].getNim());
            System.out.println("Nama                  : " + Mahasiswa[i].getNama());
            System.out.print("Total Kata 30 halaman : ");
            Mahasiswa[i].JumlahKata();
        }
    }

}
