import java.util.Scanner;

public class soru50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[10];
        int sayi;
        int sayac = 0;

        System.out.println("En fazla 10 tane sayı giriniz (0 girerek durdurabilirsiniz):");

        while (sayac < sayilar.length) {
            System.out.print("Bir sayı girin: ");
            sayi = scanner.nextInt();

            if (sayi == 0) {
                break;
            }

            sayilar[sayac] = sayi;
            sayac++;
        }

        System.out.println("\nGirilen sayılar (0 hariç):");

        for (int i = 0; i < sayac; i++) {
            System.out.println(sayilar[i]);
        }

        scanner.close();
    }
}
