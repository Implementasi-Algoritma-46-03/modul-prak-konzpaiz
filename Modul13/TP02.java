import java.util.*;

public class TP02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] x = new double[10];
        double[] y = new double[10];

        for(int i=0;i<10;i++){
            x[i] = s.nextDouble();
        }
        for(int i=0;i<10;i++){
            y[i] = s.nextDouble();
        }

        // bubble sort descending (paling lama)
        for(int i=0;i<10;i++){
            for(int j=0;j<9;j++){
                if(x[j] < x[j+1]){
                    double tmp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = tmp;
                }
                if(y[j] < y[j+1]){
                    double tmp2 = y[j];
                    y[j] = y[j+1];
                    y[j+1] = tmp2;
                }
            }
        }

        for(int i=0;i<10;i++){
            System.out.print(x[i]);
            if(i<9) System.out.print(" ");
        }
        System.out.println();

        for(int i=0;i<10;i++){
            System.out.print(y[i]);
            if(i<9) System.out.print(" ");
        }
    }
}
