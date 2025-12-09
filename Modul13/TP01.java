import java.util.*;

public class TP01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] a = new double[10];
        double[] b = new double[10];

        for(int i=0;i<10;i++){
            a[i] = s.nextDouble();
        }

        for(int i=0;i<10;i++){
            b[i] = s.nextDouble();
        }

        // bubble sort biasa (maba style)
        for(int i=0;i<10;i++){
            for(int j=0;j<9;j++){
                if(a[j] > a[j+1]){
                    double tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
                if(b[j] > b[j+1]){
                    double tmp2 = b[j];
                    b[j] = b[j+1];
                    b[j+1] = tmp2;
                }
            }
        }

        // print hasil
        for(int i=0;i<10;i++){
            System.out.print(a[i]);
            if(i<9) System.out.print(" ");
        }
        System.out.println();

        for(int i=0;i<10;i++){
            System.out.print(b[i]);
            if(i<9) System.out.print(" ");
        }
    }
}
