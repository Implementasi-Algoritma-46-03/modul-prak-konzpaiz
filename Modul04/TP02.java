import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
         Scanner input = new Scanner(System.in);

        int transaksi = input.nextInt();
        double diskon = 0;

        // hitung diskon
        if (transaksi > 200000) {
            diskon = transaksi * 0.05;
        }

        // total setelah diskon
        double total = transaksi - diskon;

        // PPN harus dihitung dari TOTAL, bukan transaksi!
        double ppn = total * 0.11;

        // total akhir
        double totalBayar = total + ppn;

        // tampilkan hasil
        if (diskon > 0) {
            System.out.println("Transaksi = " + transaksi);
            System.out.println("Total = " + transaksi + " - " + (int)diskon);
        } else {
            System.out.println("Transaksi = " + transaksi);
            System.out.println("Total = " + transaksi);
        }

        System.out.println("Ppn 11% = " + ppn);
        System.out.println("Total dibayar = " + totalBayar);

        input.close();
    }
}