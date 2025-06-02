public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan, biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = 50000;
    }

    public int hitungBiaya() {
        return durasiLayanan * 50_000;
    }
    
    public void tampilkanTransaksi() {
        pasien.getNama();
        System.out.print(" (" + durasiLayanan + " jam): Rp " + hitungBiaya());
        System.out.println();
    }
}
