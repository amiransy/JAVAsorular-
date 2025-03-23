import java.util.Scanner;
public class soru84 {
    public static void KelimeBirlestir(String c1, String c2) {
        String birlesikKelime = c1 + c2; // İki kelimeyi birleştir
        System.out.println("Birleşik Kelime: " + birlesikKelime);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci kelimeyi girin: ");
        String kelime1 = scanner.nextLine();
        
        System.out.print("İkinci kelimeyi girin: ");
        String kelime2 = scanner.nextLine();

        KelimeBirlestir(kelime1, kelime2);

        scanner.close();
    }
}
