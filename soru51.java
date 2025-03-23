import java.util.Arrays;
import java.util.Scanner;

public class soru51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int N = scanner.nextInt();
        
        int[] sayilar = new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayilar[i] = scanner.nextInt();
        }
        
        Arrays.sort(sayilar);
        
        System.out.println("\nGirilen sayılar (küçükten büyüğe sıralı):");
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }
        
        scanner.close();
    }
}
