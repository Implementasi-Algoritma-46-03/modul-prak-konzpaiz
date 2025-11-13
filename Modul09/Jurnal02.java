import java.util.Scanner;

public class Jurnal02{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int jum=0;
  for(int i=1;i<=n;i++){
   if(i%2!=0){
    jum=jum+i;
   }
  }
  System.out.println(jum);
 }
}
//buat benerin github aja
//benerin yang kedua