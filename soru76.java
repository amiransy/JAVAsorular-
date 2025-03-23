import java.util.Scanner;
public class soru76 {
    public static int üs(int sayı, int üssü) {
        int sonuc = 1;
        
        for (int i = 0; i < üssü; i++) {
            sonuc *= sayı; 
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayı = scanner.nextInt();

        System.out.print("Üs değerini girin: ");
        int üssü = scanner.nextInt();

        int sonuç = üs(sayı, üssü);

        System.out.println(sayı + " sayısının " + üssü + " üssü: " + sonuç);

        scanner.close();
    }
}
