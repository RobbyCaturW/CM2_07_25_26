public class SistemTransaksi {
    NodePasien head, tail;

    public void tambahPasien(Pasien pasien) {
        NodePasien baru = new NodePasien(pasien);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        System.out.println("Pasien berhasil ditambahkan ke antrian.");
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

    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("===== Antrian Pasien =====");
        NodePasien current = head;
        int no = 1;
        while (current != null) {
            System.out.println(no + ". " + current.data.nama + " (NIK: " + current.data.nik + ")");
            current = current.next;
            no++;
        }
        System.out.println("===========================");
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
