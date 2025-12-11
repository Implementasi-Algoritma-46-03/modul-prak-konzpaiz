import java.util.Scanner;

public class Jurnal03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String a[] = new String[n];

        for(int i=0;i<n;i++){
            a[i] = s.next();
        }

        String key = s.next();

        // sort dulu ASC (syarat binary search)
        for(int i=1;i<n;i++){
            String tmp = a[i];
            int j=i-1;
            while(j>=0 && a[j].compareTo(tmp) > 0){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = tmp;
        }

        // binary search
        int l=0,r=n-1,mid,pos=-1;

        while(l<=r){
            mid = (l+r)/2;
            if(a[mid].equals(key)){
                pos = mid;
                break;
            } else if(a[mid].compareTo(key) < 0){
                l = mid+1;
            } else {
                r = mid-1;
            }
        }

        if(pos!=-1){
            System.out.println("Ditemukan di indeks ke-" + pos);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
