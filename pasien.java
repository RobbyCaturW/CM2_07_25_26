public class pasien{
    String nama;
    String nik;
    String keluhan;

    public pasien(String nama, String nik, String keluhan){
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
    }

    public void tampilkanInformasi(){
        System.out.print("Nama Pasien : ");
        System.out.print("NIK : ");
        System.out.print("Keluhan : ");
    }
}