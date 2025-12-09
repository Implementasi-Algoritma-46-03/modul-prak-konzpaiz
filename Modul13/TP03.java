import java.util.*;

public class TP03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        int key = s.nextInt();
        int ketemu = -1;

        for(int i=0;i<n;i++){
            if(arr[i] == key){
                ketemu = i;
                break;
            }
        }

        if(ketemu != -1){
            System.out.println("Ditemukan di indeks ke-" + ketemu);
        } else {
            System.out.println("Tidak ditemukan");
        }
    }
}
