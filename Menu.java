public class Menu {
    Produk produk = new Produk();

    public Menu(Produk produk){
        this.produk = produk 
    } 
    
    public void daftarMenu() {
        System.out.println("==== Menu Snack ====");
        System.out.println("1. Makanan Coklat (Harga: Rp 10.000) (Stock: " + produk.get_stock1() + ")");
        System.out.println("2. Makanan Kacang (Harga: Rp 3.000) (Stock: " + produk.get_stock2() + ")");
        System.out.println("3. Makanan Keripik (Harga: Rp 5.000) (Stock: " + produk.get_stock3() + ")");
        System.out.println("4. Minuman Air (Harga: Rp 5.000) (Stock: " + produk.get_stock4() + ")");
        System.out.println("5. Minuman Kopi (Harga: Rp 10.000) (Stock: " + produk.get_stock5() + ")");
        System.out.println("6. Minuman Soda (Harga: Rp 15.000) (Stock: " + produk.get_stock6() + ")");
    }
}
