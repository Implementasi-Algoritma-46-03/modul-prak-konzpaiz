import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner sc = new Scanner(System.in);

        String bentuk = sc.nextLine();
        double luas = 0;
        double keliling = 0;

        switch (bentuk) {
            case "Persegi":
                int sisi = sc.nextInt();
                luas = sisi * sisi;
                keliling = 4 * sisi;
                System.out.println((int)luas +  " " + (int)keliling);
                break;

            case "Persegi Panjang":
                int p = sc.nextInt();
                int l = sc.nextInt();
                luas = p * l;
                keliling = 2 * (p + l);
                System.out.println((int)luas + " " +(int)keliling);
                break;

            case "Segitiga":
                int a = sc.nextInt();
                int t = sc.nextInt();
                luas = 0.5 * a * t;
                keliling = a + t + Math.sqrt(a * a + t * t);
                System.out.println((int)luas + " " + (int)keliling);
                break;

            case "Lingkaran":
                int d = sc.nextInt();
                double r = d / 2.0;
                luas = 3.14 * r * r;
                keliling = 3.14 * d;
                System.out.printf("%.2f %.2f", luas, keliling);
                break;

            default:
                System.out.println("Bangun tidak dikenali");
                return;
        }
    }
}
