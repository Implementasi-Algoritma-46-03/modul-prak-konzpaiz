import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner sc = new Scanner(System.in);
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        double r3 = sc.nextDouble();

        double c1 = konversiCelcius(r1);
        double c2 = konversiCelcius(r2);
        double c3 = konversiCelcius(r3);

        double re1 = konversiReamur(r1);
        double re2 = konversiReamur(r2);
        double re3 = konversiReamur(r3);

        System.out.printf("%.2f %.2f %.2f\n", c1, c2, c3);
        System.out.printf("%.2f %.2f %.2f\n", re1, re2, re3);
    }

    public static double konversiCelcius(double f){
        return (f - 32) * 5 / 9;
    }

    public static double konversiReamur(double f){
        return (f - 32) * 4 / 9;
    }
}