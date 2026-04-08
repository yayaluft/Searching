package praktikum07;

import java.util.Scanner;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10();
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        
        for (int i = 1; i <= jumMhs; i++) {
            System.out.println("--Mahasiswa ke-" + i + " --");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa10 m = new Mahasiswa10(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();
        System.out.println("------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("-------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}