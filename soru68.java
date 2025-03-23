import java.util.Scanner;

public class soru68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir karakter dizisi giriniz: ");
        String karakterDizisi = scanner.nextLine();

        int uzunluk = karakterDizisi.length();

        System.out.println("Girilen karakter dizisinin uzunluğu: " + uzunluk);

        scanner.close();
    }
}
