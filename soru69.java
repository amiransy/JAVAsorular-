import java.util.Scanner;

public class soru69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk karakter dizisini giriniz: ");
        String dizi1 = scanner.nextLine();

        System.out.print("İkinci karakter dizisini giriniz: ");
        String dizi2 = scanner.nextLine();

        String birlesmisDizi = dizi1 + dizi2;

        System.out.println("Birleştirilmiş karakter dizisi: " + birlesmisDizi);

        scanner.close();
    }
}
