public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan, biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan, int biaya) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = biaya;
    }

    int hitungBiaya() {
        return durasiLayanan * 50_000;
    }
    
    public void tampilkanTransaksi() {
        System.out.println("===== Transaksi Layanan =====");
        pasien.tampilkanInformasi();
        System.out.println("Dokter: " + dokter.idDokter + " - " + dokter.nama);
        System.out.println("Durasi Layanan: " + durasiLayanan + " jam");
        System.out.println("Biaya: Rp " + biaya);
        System.out.println("===============================");
    }
}
