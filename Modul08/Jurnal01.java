import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner sc = new Scanner(System.in);
  int amo = 30;
  int waktu = 0;
  int n = sc.nextInt();

  if(n <= 30){
   System.out.println(0);
  } else {
   while(amo < n){
    amo = amo * 2;
    waktu = waktu + 15;
   }
   System.out.println(waktu);
  }
 }
}

  
