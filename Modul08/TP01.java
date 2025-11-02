import java.util.Scanner;
public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
         Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int amo = 30;
  int menit = 0;

  while(amo < n){
   amo = amo * 2;
   menit = menit + 15;
  }

  System.out.println(menit);
 }
}
