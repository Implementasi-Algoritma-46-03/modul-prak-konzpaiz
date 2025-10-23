import java.util.Scanner;

public class Jurnal01 {

    private static String sapa(int jam) {
        if (jam >= 6 && jam <= 11) {
            return "pagi";
        } else if (jam >= 12 && jam <= 14) {
            return "siang";
        } else if (jam >= 15 && jam <= 17) {
            return "sore";
    } else  {
            return "malam";
    }
    }
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String nama1 = s.nextLine();
        String nama2 = s.nextLine();
        int jam = s.nextInt();
        String hasilJam =  sapa(jam);

        System.out.println("Halo, " + nama1 + ". Selamat " + hasilJam + ".");
        System.out.println("Halo, " + nama2 + ". Selamat " + hasilJam + ".");
    }
}