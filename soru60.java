import java.util.Scanner;

public class soru60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] ogrNotlar = new int[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". öğrencinin sınav notlarını girin:");
            for (int j = 0; j < 3; j++) {
                System.out.print((j + 1) + ". sınav notu: ");
                ogrNotlar[i][j] = scanner.nextInt();
            }
        }

        int toplamNot = ogrNotlar[0][0] + ogrNotlar[1][1] + ogrNotlar[2][2];
        System.out.println("\n1. öğrencinin 1. sınav notu + 2. öğrencinin 2. sınav notu + 3. öğrencinin 3. sınav notu = " + toplamNot);

        System.out.println("\nHer sınav için ağırlıklı not ortalaması:");
        for (int j = 0; j < 3; j++) {
            int toplamSinavNotu = 0;
            for (int i = 0; i < 3; i++) {
                toplamSinavNotu += ogrNotlar[i][j];
            }
            double agirlikliOrtalama = (double) toplamSinavNotu / 3;
            System.out.printf("%d. sınavın ağırlıklı not ortalaması: %.2f%n", (j + 1), agirlikliOrtalama);
        }

        scanner.close();
    }
}
