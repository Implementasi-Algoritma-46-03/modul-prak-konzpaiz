import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner sc = new Scanner(System.in);
        String bentuk = sc.nextLine();

        if(bentuk.equals("Persegi")){
            int s = sc.nextInt();
            System.out.println(luasPersegi(s) + " " + kelilingPersegi(s));
        }
        else if(bentuk.equals("Persegi Panjang")){
            int p = sc.nextInt();
            int l = sc.nextInt();
            System.out.println(luasPP(p,l) + " " + kelilingPP(p,l));
        }
        else if(bentuk.equals("Segitiga")){
            int a = sc.nextInt();
            int t = sc.nextInt();
            System.out.println((int)luasSegitiga(a,t) + " " + (int)kelilingSegitiga(a,t));
        }
        else if(bentuk.equals("Lingkaran")){
            int d = sc.nextInt();
            System.out.printf("%.2f %.2f\n", luasLingkaran(d), kelilingLingkaran(d));
        }
        else{
            System.out.println("Bangun tidak dikenali");
        }
    }

    public static int luasPersegi(int s){
        return s*s;
    }

    public static int kelilingPersegi(int s){
        return 4*s;
    }

    public static int luasPP(int p, int l){
        return p*l;
    }

    public static int kelilingPP(int p, int l){
        return 2*(p+l);
    }

    public static double luasSegitiga(int a, int t){
        return 0.5 * a * t;
    }

    public static double kelilingSegitiga(int a, int t){
        return a + t + Math.sqrt(a*a + t*t);
    }

    public static double luasLingkaran(int d){
        double r = d / 2.0;
        return 3.14 * r * r;
    }

    public static double kelilingLingkaran(int d){
        return 3.14 * d;
    }
}

