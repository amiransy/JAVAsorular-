import java.util.Scanner;

public class soru72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");
        StringBuilder sonuc = new StringBuilder();

        for (String kelime : kelimeler) {
            if (kelime.length() > 0) {
                String ilkHarfBuyuk = kelime.substring(0, 1).toUpperCase();
                String geriKalan = kelime.substring(1).toLowerCase();
                sonuc.append(ilkHarfBuyuk).append(geriKalan).append(" ");
            }
        }
        System.out.println("Düzenlenmiş cümle: " + sonuc.toString().trim());

        scanner.close();
    }
}
