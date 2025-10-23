import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
         Scanner sc = new Scanner(System.in);
        String kalimat = sc.nextLine();
        String hasil = hapusVokal(kalimat);
        System.out.println(hasil);
    }

    public static String hapusVokal(String teks){
        String baru = "";
        for(int i=0; i<teks.length(); i++){
            char c = teks.charAt(i);
            if(c!='a' && c!='i' && c!='u' && c!='e' && c!='o' &&
               c!='A' && c!='I' && c!='U' && c!='E' && c!='O'){
                baru = baru + c;
            }
        }
        return baru;
    }
}
