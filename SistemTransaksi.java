public class SistemTransaksi {
    NodePasien head, tail;

    public void tambahPasien(Pasien pasien) {
        NodePasien baru = new NodePasien(pasien);
        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        System.out.println(">> Pasien masuk ke dalam antrian");
    }

    public Pasien layaniPasien() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Pasien pasien = head.data;
        head = head.next;
        if (head == null) tail = null;
        return pasien;
    }

    public void tampilkanPasien() {
        NodePasien curr = head;
        System.out.println("Pasien " + curr.data.nama + " dipanggil");
    }

    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println();
        System.out.println("-- Antrian Pasien --");
        System.out.println("Antrian Pasien:");
        NodePasien current = head;
        while (current != null) {
            System.out.println("Nama pasien: " + current.data.nama + "\nNIK: " + current.data.nik + "\nKeluhan: " + current.data.keluhan);
            current = current.next;
        }
    }

    public int hitungSisa() {
        int count = 0;
        NodePasien current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
