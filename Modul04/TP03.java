import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int dira = input.nextInt();
        int radi = input.nextInt();
        int idar = input.nextInt();

        if (dira > radi && dira > idar) {
            System.out.println("Dira");
        } else if (radi > dira && radi > idar) {
            System.out.println("Radi");
        } else {
            System.out.println("Idar");
        }

        input.close();
    }
}

