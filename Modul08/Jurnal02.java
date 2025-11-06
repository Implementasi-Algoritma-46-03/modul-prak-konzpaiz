import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
         Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int balik = 0;

  while(n > 0){
   int sisa = n % 10;
   balik = balik * 10 + sisa;
   n = n / 10;
  }

  System.out.println(balik);
 }
}
