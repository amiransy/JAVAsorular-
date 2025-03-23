import java.util.Scanner;

public class soru66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan matris değerlerini alma
        System.out.println("2x2'lik matrisin elemanlarını giriniz:");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        System.out.print("d: ");
        double d = scanner.nextDouble();

        // Determinant hesaplama
        double determinant = a * d - b * c;

        System.out.println("Matrisin Determinantı: " + determinant);

        // Singüler veya regüler olup olmadığını kontrol etme
        if (determinant == 0) {
            System.out.println("Matris singülerdir, yani tersi yoktur.");
        } else {
            // Matris regülerse tersini hesapla
            System.out.println("Matris regülerdir. Tersi:");
            double[][] tersMatris = {
                {d / determinant, -b / determinant},
                {-c / determinant, a / determinant}
            };

            // Ters matrisi yazdırma
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.printf("%.2f ", tersMatris[i][j]);
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
