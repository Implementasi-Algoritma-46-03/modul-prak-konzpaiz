import java.util.Scanner;
public class TP02{
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  double p[] = new double[10];
  double q[] = new double[10];
  String tok;

  for(int i=0;i<10;i++){
   tok = s.next();
   p[i] = Double.parseDouble(tok.replace(',','.'));
  }
  for(int i=0;i<10;i++){
   tok = s.next();
   q[i] = Double.parseDouble(tok.replace(',','.'));
  }

  // bubble sort descending (besar ke kecil)
  for(int i=0;i<10;i++){
   for(int j=0;j<9;j++){
    if(p[j] < p[j+1]){
     double t=p[j]; p[j]=p[j+1]; p[j+1]=t;
    }
    if(q[j] < q[j+1]){
     double t=q[j]; q[j]=q[j+1]; q[j+1]=t;
    }
   }
  }

  for(int i=0;i<10;i++){
   System.out.print(String.format("%.2f", p[i]));
   if(i<9) System.out.print(" ");
  }
  System.out.println();
  for(int i=0;i<10;i++){
   System.out.print(String.format("%.2f", q[i]));
   if(i<9) System.out.print(" ");
  }
 }
}
