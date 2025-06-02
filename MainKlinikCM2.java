import java.util.Scanner;
public class MainKlinikCM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        RiwayatTransaksi riwayat = new RiwayatTransaksi(100);
        SistemTransaksi antrian = new SistemTransaksi();

        do {
            System.out.println();
            System.out.println("===  SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pasien : ");
                    String nama = sc.nextLine();
                    System.out.print("NIK : ");
                    String nik = sc.nextLine();
                    System.out.print("Keluhan : ");
                    String keluhan = sc.nextLine();
                    Pasien pasien = new Pasien(nama, nik, keluhan);
                    antrian.tambahPasien(pasien);
                    break;
                case 2:
                    antrian.tampilkanAntrian();
                    break;
                case 3:
                    antrian.tampilkanPasien();
                    Pasien dilayani = antrian.layaniPasien();
                    if (dilayani != null) {
                        System.out.print("Masukkan ID Dokter : ");
                        String idDokter = sc.nextLine();
                        System.out.print("Masukkan Nama Dokter : ");
                        String namaDokter = sc.nextLine();
                        System.out.print("Masukkan Durasi Layanan (jam) : ");
                        int durasi = sc.nextInt();
                        sc.nextLine(); 

                        Dokter dokter = new Dokter(idDokter, namaDokter);
                        TransaksiLayanan t = new TransaksiLayanan(dilayani, dokter, durasi);
                        riwayat.tambahTransaksi(t);
                    }
                    break;
                case 4:
                    int sisa = antrian.hitungSisa();
                    System.out.print(">> Sisa pasien dalam antrian : " + sisa);
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    riwayat.tampilkanRiwayat();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid.");    
            }
        } while (pilihan != 0);
    }
}