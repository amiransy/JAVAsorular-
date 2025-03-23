import java.util.Scanner;

public class soru54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pozitif bir N tamsayısı girin: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Lütfen pozitif bir tamsayı girin.");
        } else {
            int[] sayilar = new int[N];
            
            for (int i = 0; i < N; i++) {
                sayilar[i] = i + 1;
            }
            System.out.println("\n1'den " + N + "'e kadar olan sayıların kareleri:");
            
            for (int sayi : sayilar) {
                System.out.println("Sayı: " + sayi + ", Kare: " + (sayi * sayi));
            }
        }
        
        scanner.close();
    }
}
