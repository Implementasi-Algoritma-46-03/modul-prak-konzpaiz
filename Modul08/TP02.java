import java.util.Scanner;
public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int rev = 0;

  while(n != 0){
   int sisa = n % 10;
   rev = rev * 10 + sisa;
   n = n / 10;
  }

  System.out.println(rev);
 }
}
