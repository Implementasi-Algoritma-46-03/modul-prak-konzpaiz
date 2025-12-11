import java.util.Scanner;

public class Jurnal02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String arr[] = new String[n];

        for(int i=0;i<n;i++){
            arr[i] = s.next();
        }

        for(int i=1;i<n;i++){
            String x = arr[i];
            int j = i-1;

            while(j>=0 && arr[j].compareTo(x) > 0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i<n-1) System.out.print(" ");
        }
    }
}

