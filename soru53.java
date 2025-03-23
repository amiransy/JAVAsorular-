import java.util.Scanner;

public class soru53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[10];

        System.out.println("Birbirinden farklı 10 pozitif tamsayı girin:");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            int sayi = scanner.nextInt();

            if (sayi <= 0) {
                System.out.println("Lütfen pozitif bir sayı girin.");
                i--; 
                continue;
            }

            boolean tekrarVarMi = false;
            for (int j = 0; j < i; j++) {
                if (sayilar[j] == sayi) {
                    tekrarVarMi = true;
                    break;
                }
            }
            
            if (tekrarVarMi) {
                System.out.println("Bu sayı daha önce girildi. Farklı bir sayı girin.");
                i--; 
            } else {
                sayilar[i] = sayi; 
            }
        }

        int enBuyuk = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] > enBuyuk) {
                enBuyuk = sayilar[i];
            }
        }

        System.out.println("\nGirilen sayılardan en büyüğü: " + enBuyuk);

        scanner.close();
    }
}
