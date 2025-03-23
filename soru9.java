import java.util.Scanner;

public class soru9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Sicil numaranızı girin:");
        int sicil_no=scanner.nextInt();
        System.out.println("Calışma saatinizi girin:");
        int çalışma_saati=scanner.nextInt();
        System.out.println("Saatlik ücretinizi girin:");
        int saatlik_ücret=scanner.nextInt();

        int maaş=çalışma_saati*saatlik_ücret;

        System.out.println(sicil_no+"siciil nolu çalışanın aylık maaşı:"+maaş+"TL");
    }
}
