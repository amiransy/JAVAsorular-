import java.util.Scanner;

public class soru25 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Plaka kodu girin:");
        int plaka_kodu=scanner.nextInt();

        switch(plaka_kodu){
            case 6:
            System.out.println("Plaka Ankara'ya aittir...");
            break;
            case 34:
            System.out.println("Plaka İstanbul'a aittir...");
            break;
            case 35:
            System.out.println("Plaka İzmir'e aittir...");
            break;
            case 45:
            System.out.println("Plaka Mnaisa'ya aittir...");
            break;
            default:
            System.out.println("Geçersiz plaka kodu...");
        }
    }
}
