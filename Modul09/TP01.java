import java.util.Scanner;
public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for(int i=1;i<=n;i++){
   if(i%2==0){
    System.out.println(i+" Genap");
   } else {
    System.out.println(i+" Ganjil");
   }
  }
 }
}
