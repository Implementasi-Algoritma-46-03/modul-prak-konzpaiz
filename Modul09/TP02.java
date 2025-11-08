import java.util.Scanner;
public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner sc = new Scanner(System.in);
  String teks = sc.nextLine();
  int hitung = 0;

  for(int i=0;i<teks.length();i++){
   char c = teks.charAt(i);
   if(c=='a'||c=='i'||c=='u'||c=='e'||c=='o'){
    hitung = hitung + 1;
   }
  }
  System.out.println(hitung);
 }
}
