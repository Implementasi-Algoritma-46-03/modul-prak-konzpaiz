import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
         Scanner sc = new Scanner(System.in);
            int dira = sc.nextInt();
            int radi = sc.nextInt();
            int idar = sc.nextInt();

            if(dira < radi && dira < idar){
            if(radi < idar){
                System.out.println("Dira, Radi, Idar");
            }else{
                System.out.println("Dira, Idar, Radi");
            }
        }else if(radi < dira && radi < idar){
            if(dira < idar){
                System.out.println("Radi, Dira, Idar");
            }else{
                System.out.println("Radi, Idar, Dira");
            }
        }else{
            if(dira < radi){
                System.out.println("Idar, Dira, Radi");
            }else{
                System.out.println("Idar, Radi, Dira");
            }
        }
    }
}

