import java.util.Scanner;

public class soru80 {

    // Ortalama hesaplayan ve sonucu ekrana yazdıran fonksiyon
    public static void ortalamaHesapla(int vize, int finalNotu) {
        double ortalama = (vize * 0.4) + (finalNotu * 0.6);
        System.out.println("Ortalama not: " + ortalama);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan vize ve final notunu alma
        System.out.print("Vize notunu girin: ");
        int vize = scanner.nextInt();

        System.out.print("Final notunu girin: ");
        int finalNotu = scanner.nextInt();

        // ortalamaHesapla fonksiyonunu çağırma
        ortalamaHesapla(vize, finalNotu);

        scanner.close();
    }
}
