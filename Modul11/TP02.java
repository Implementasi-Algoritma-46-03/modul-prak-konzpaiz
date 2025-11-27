import java.util.Scanner;
public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(a[j] < a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]);
            if(i<n-1) System.out.print(" ");
        }
    }
}

//update pais