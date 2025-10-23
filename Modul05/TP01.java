import java.util.Scanner;

public class TP01 {
public static void main(final String[] args) {
        // Kerjakan soalnya di sini
      Scanner sc = new Scanner(System.in);

        String bulan = sc.nextLine();
        String hasil = "";

        switch (bulan) {
            case "januari":
                hasil = "janvier";
                break;
            case "februari":
                hasil = "fevrier";
                break;
            case "maret":
                hasil = "mars";
                break;
            case "april":
                hasil = "avril";
                break;
            case "mei":
                hasil = "mai";
                break;
            case "juni":
                hasil = "juin";
                break;
            case "juli":
                hasil = "juillet";
                break;
            case "agustus":
                hasil = "aout";
                break;
            case "september":
                hasil = "septembre";
                break;
            case "oktober":
                hasil = "oktobre";
                break;
            case "november":
                hasil = "novembre";
                break;
            case "desember":
                hasil = "decembre";
                break;
            default:
                hasil = "bulan tidak dikenali";
                break;
        }

        System.out.println(hasil);
    }
}
