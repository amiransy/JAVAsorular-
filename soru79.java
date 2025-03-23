import java.util.Scanner;
public class soru79 {
    public static void kareYazdir(int sayi) {
        int kare = sayi * sayi;
        System.out.println("Girdiğiniz sayının karesi: " + kare);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        kareYazdir(sayi);

        scanner.close();
    }
}
