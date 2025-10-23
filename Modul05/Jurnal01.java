import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kodemenu = sc.nextInt();
        int jumlahpesanan = sc.nextInt();

        int harga = 0;
        String namamakanan = "";

        switch(kodemenu){
            case 1:
                namamakanan = "Nasi Goreng";
                harga = 15000;
                break;
            case 2:
                namamakanan = "Mie Goreng / Nyemek";
                harga = 18000;
                break;
            case 3:
                namamakanan = "Kwetiau Goreng / Nyemek";
                harga = 20000;
                break;
            case 4:
                namamakanan = "Capcay Goreng / Kuah";
                harga = 23000;
                break;
            default:
                System.out.println("Kode menu tidak valid");
                return;
        }

        int total = jumlahpesanan * harga;
        total = total / 1000;
        System.out.println(namamakanan + " " + jumlahpesanan + " buah, total harga Rp. " + total + ".000");
    }
}
