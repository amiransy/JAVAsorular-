import java.util.Scanner;
public class soru77 {
    public static char harfNotuHesapla(int puan) {
        if (puan >= 90) {
            return 'A';
        } else if (puan >= 80) {
            return 'B';
        } else if (puan >= 70) {
            return 'C';
        } else if (puan >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrencinin puanını girin: ");
        int puan = scanner.nextInt();

        char harfNotu = harfNotuHesapla(puan);

        System.out.println("Öğrencinin harf notu: " + harfNotu);

        scanner.close();
    }
}
