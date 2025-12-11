import java.util.Scanner;
public class TP01{
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  double a[] = new double[10];
  double b[] = new double[10];
  String tok;

  
  for(int i=0;i<10;i++){
   tok = s.next();
   a[i] = Double.parseDouble(tok.replace(',','.'));
  }
  
  for(int i=0;i<10;i++){
   tok = s.next();
   b[i] = Double.parseDouble(tok.replace(',','.'));
  }

  
  for(int i=0;i<10;i++){
   for(int j=0;j<9;j++){
    if(a[j] > a[j+1]){
     double t=a[j]; a[j]=a[j+1]; a[j+1]=t;
    }
    if(b[j] > b[j+1]){
     double t=b[j]; b[j]=b[j+1]; b[j+1]=t;
    }
   }
  }

  
  for(int i=0;i<10;i++){
   System.out.print(String.format("%.2f", a[i]));
   if(i<9) System.out.print(" ");
  }
  System.out.println();

  
  for(int i=0;i<10;i++){
   System.out.print(String.format("%.2f", b[i]));
   if(i<9) System.out.print(" ");
  }
 }
}
