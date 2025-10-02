import java.util.Scanner;

public class TP02 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = input.next();   // baca 1 kata
        int jumlah = input.nextInt(); // baca angka
        int harga = input.nextInt();  // baca angka

        int total = harga * jumlah;

        System.out.println("Hi, " + nama + ". Total belanja adalah " + total + " rupiah.");

        input.close();
    }
}
