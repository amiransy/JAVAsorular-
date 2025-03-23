import java.util.ArrayList;
import java.util.Scanner;

public class soru55 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pozitif bir N tamsayısı girin: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Lütfen pozitif bir tamsayı girin.");
        } else {
            ArrayList<Integer> tekSayilar = new ArrayList<>();
            ArrayList<Integer> ciftSayilar = new ArrayList<>();

            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    ciftSayilar.add(i); 
                } else {
                    tekSayilar.add(i); 
                }
            }

            System.out.println("\nTek sayılar:");
            for (int sayi : tekSayilar) {
                System.out.println(sayi);
            }

            System.out.println("\nÇift sayılar:");
            for (int sayi : ciftSayilar) {
                System.out.println(sayi);
            }
        }

        scanner.close();
    }
}
