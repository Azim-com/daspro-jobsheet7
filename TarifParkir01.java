import java.util.Scanner;
public class TarifParkir01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 untuk selesai) : ");
            jenis = sc.nextInt();

                if (jenis == 0) {
                    System.out.println("Transaksi Selesai.");
                    break;
                }
                if (jenis == 1 || jenis == 2) {
                    System.out.print("Masukkan durasi parkir        : ");
                    durasi = sc.nextInt();
                    
                    if (jenis == 1) {
                    total += durasi * 3000;
                    } else {
                    total += durasi * 2000;
                    }
                }
                System.out.println("Total biaya parkir adalah : Rp. " + total);
        } while (true);
    }
}