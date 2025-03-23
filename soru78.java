import java.util.Scanner;
public class soru78 {
    public static int enBuyuk(int sayi1, int sayi2, int sayi3) {
        int enBuyukSayi = sayi1;

        if (sayi2 > enBuyukSayi) {
            enBuyukSayi = sayi2;
        }
        if (sayi3 > enBuyukSayi) {
            enBuyukSayi = sayi3;
        }

        return enBuyukSayi;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı girin: ");
        int sayi3 = scanner.nextInt();

        int enBuyukSayi = enBuyuk(sayi1, sayi2, sayi3);

        System.out.println("Girilen sayılardan en büyüğü: " + enBuyukSayi);

        scanner.close();
    }
}
