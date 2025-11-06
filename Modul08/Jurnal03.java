import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner sc = new Scanner(System.in);
  int total = 0;
  int angka = sc.nextInt();

  while(angka != 0){
   total = total + angka;
   angka = sc.nextInt();
  }

  System.out.println(total);
 }
}
