import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
         Scanner input = new Scanner(System.in);
        double nilaiUjian1 = input.nextDouble();
        double nilaiUjian2 = input.nextDouble();
        double nilaiUjian3 = input.nextDouble();
        double rataRata = (nilaiUjian1 + nilaiUjian2 + nilaiUjian3) / 3;
        System.out.printf("Nilai rata-rata: %.2f\n", rataRata);
    }
}
