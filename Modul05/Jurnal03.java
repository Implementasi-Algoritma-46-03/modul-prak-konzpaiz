import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angka1 = sc.nextInt();
        char op = sc.next().charAt(0);
        double angka2 = sc.nextInt();

        switch(op){
            case '+':
                System.out.println((int)angka1 + angka2);
                break;
            case '-':
                System.out.println((int)angka1 - angka2);
                break;
            case '*':
                System.out.println((int)angka1 * angka2);
                break;
            case '/':
                double hasilBagi = angka1 / angka2; 
                System.out.printf("%.7f",hasilBagi);
                break;
            default:
                System.out.println("Operator tidak valid");
                break;
        }
    }
}