import java.util.Random;
import java.util.Scanner;
public class soru74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Başlangıç değeri (seed) giriniz: ");
        long seed = scanner.nextLong();

        Random random = new Random(seed);

        for (int i = 0; i < seed; i++) {
            int rastgeleSayi = random.nextInt(6) + 1;
            System.out.println("Üretilen rastgele sayı: " + rastgeleSayi);
        }

        scanner.close();
    }
}
