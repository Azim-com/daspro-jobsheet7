import java.util.Scanner;
public class TiketBioskop01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jml, hargaTiket = 50000, diskon, harga, totalHarga, totalDiskon;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai) : ");
            jml = sc.nextInt();

            if (jml < 0) {
                System.out.println("Jumlah tidak valid!");
                continue;
            }
            if (jml == 0) {
                break;
            }
            harga = jml * hargaTiket;

            if (jml > 10) {
                diskon = 15;
            } else if (jml > 4) {
                diskon =10;
            } else {
                diskon = 0;
            }
            totalDiskon = harga * diskon / 100;
            totalHarga = harga - totalDiskon;

            System.out.println("Harga sebelum diskon    : Rp. " + harga);
            System.out.println("Total diskon harga      : Rp. " + totalDiskon);
            System.out.println("Harga setelah diskon    : Rp. " + totalHarga);
            System.out.println("Total tiket terjual     : " + jml + " Tiket");
            System.out.println("Total harga tiket       : Rp. " + totalHarga);
        } while (true);
        System.out.println("Transaksi selesai.");
    }
}