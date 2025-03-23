import java.util.Scanner;
public class soru67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] karakterDizisi = new char[50];

        System.out.println("Bir metin giriniz (50 karaktere kadar): ");
        String giris = scanner.nextLine();

        int uzunluk = Math.min(giris.length(), 50);
        for (int i = 0; i < uzunluk; i++) {
            karakterDizisi[i] = giris.charAt(i);
        }

        System.out.println("Karakterler tek tek:");
        for (int i = 0; i < uzunluk; i++) {
            System.out.println(karakterDizisi[i]);
        }

        System.out.println("\nTüm metin:");
        System.out.println(giris.substring(0, uzunluk));

        scanner.close();
    }
}
