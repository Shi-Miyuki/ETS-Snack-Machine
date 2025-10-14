import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produk produk = new Produk();
        Menu menu = new Menu(produk);
        
        
        
        while (true) {
            menu.daftarMenu();
            System.out.println("Informasi:");
            System.out.println("Masukkan nilai 0 jika ingin keluar dari menu");
            System.out.println("Masukkan pilihan menu: ");
            int pilihan = scanner.nextInt();
            produk.pesanan(pilihan);
            
            if (pilihan == 0) {
                break;
            } 
        }
        
        System.out.println("Total harga pesanan: Rp " + produk.total_pesanan());          
        
        System.out.println("Masukkan uang: ");
        int uang = scanner.nextInt();
        
        produk.uang_masuk(uang);
        
        produk.keputusan();
        
        produk.tampilkanLog();
        
        Closer close = new Closer();
        close.greeting();
    }
}
