import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        double pajak;
        int penghasilanBersih;

        if (n <= 50) {
            p = 5;
        } else if (n <= 250) {
            p = 15;
        } else if (n <= 500) {
            p = 25;
        } else {
            p = 30;
        }

        pajak = n * 1000000 * (p / 100.0);
        penghasilanBersih = (int)((n * 1000000) - pajak);

        System.out.println("Penghasilan kotor = " + n + " juta Rupiah");
        System.out.println("Pajak " + p + "% = Rp. " + (int) pajak);
        System.out.println("Penghasilan bersih = Rp. " + penghasilanBersih);

        sc.close();
    }
}