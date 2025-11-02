import java.util.Scanner;
public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner sc = new Scanner(System.in);
  int total = 0;
  int x = sc.nextInt();

  while(x != 0){
   total = total + x;
   x = sc.nextInt();
  }

  System.out.println(total);
 }
}
