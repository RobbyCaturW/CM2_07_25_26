public class RiwayatTransaksi {
    TransaksiLayanan[] queue;
    int front, rear, size, capacity;

    public RiwayatTransaksi(int capacity) {
        this.capacity = capacity;
        this.queue = new TransaksiLayanan[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void tambahTransaksi(TransaksiLayanan t) {
        if (size == capacity) {
            System.out.println("Riwayat transaksi penuh!");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = t;
        size++;
        System.out.println(">> Pasien telah dilayani, Transaksi berhasil dicatat.");
    }

    public void tampilkanRiwayat() {
        if (size == 0) {
            System.out.println("Belum ada transaksi layanan.");
            return;
        }
        System.out.println("-- Riwayat Transaksi --");
        System.out.println("Daftar Transaksi:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % capacity;
            queue[idx].tampilkanTransaksi();
        }
    }
}