import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int hasil = fakt(n);
  System.out.println(hasil);
 }

 public static int fakt(int x){
  if(x==1){
   return 1;
  } else {
   return x * fakt(x-1);
  }
 }
}
