public class Produk {
    private int stock1 = 2;
    private int stock2 = 2;
    private int stock3 = 2;
    private int stock4 = 2;
    private int stock5 = 2;
    private int stock6 = 2;
    
    private int uang_pelanggan;
    private int total_harga;
    
    private int[] logTransaksi = new int[10];
    private int transaksiIndex = 0;

    public void uang_masuk(int uang_pelanggan) {
        this.uang_pelanggan = uang_pelanggan;
    }
    
    public void pesanan(int pilihan) {
        if (pilihan == 1 && stock1 > 0) {
            total_harga += 10000;
            stock1 -= 1;
        } else if (pilihan == 2 && stock2 > 0) {
            total_harga += 3000;
            stock2 -= 1;
        } else if (pilihan == 3 && stock3 > 0) {
            total_harga += 5000;
            stock3 -= 1;
        } else if (pilihan == 4 && stock4 > 0) {
            total_harga += 5000;
            stock4 -= 1;
        } else if (pilihan == 5 && stock5 > 0) {
            total_harga += 10000;
            stock5 -= 1;
        } else if (pilihan == 6 && stock6 > 0) {
            total_harga += 15000;
            stock6 -= 1;
        } else {
            System.out.println("Stok habis atau pilihan tidak valid.");
        }
    }
    
    public int get_stock1() {
        return stock1;
    }
    public int get_stock2() {
        return stock2;
    }
    public int get_stock3() {
        return stock3;
    }
    public int get_stock4() {
        return stock4;
    }
    public int get_stock5() {
        return stock5;
    }
    public int get_stock6() {
        return stock6;
    }
    
    public int total_pesanan() {
        return total_harga;
    }
    
    public void keputusan() {
        if (uang_pelanggan >= total_harga) {
            System.out.println("Transaksi berhasil");
            System.out.println("Kembalian: Rp " + (uang_pelanggan - total_harga));
            if (transaksiIndex < logTransaksi.length) {
                logTransaksi[transaksiIndex] = total_harga;
                transaksiIndex++;
            }
        } else {
            System.out.println("Transaksi gagal");
            System.out.println("Uang anda tidak cukup");
            System.out.println("Kembalian: Rp " + uang_pelanggan);
        }
    }
    
    public void tampilkanLog() {
        System.out.println("\n==== Log Transaksi ====");
        if (transaksiIndex == 0) {
            System.out.println("Tidak ada transaksi.");
        } else {
            for (int i = 0; i < transaksiIndex; i++) {
                System.out.println("Transaksi " + (i + 1) + ": Rp " + logTransaksi[i]);
            }
        }
    }
}
