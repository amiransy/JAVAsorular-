import java.util.Scanner;

public class soru31 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("***** ARAÇ TİPİ *****");
        String araçtipi="A/a - Arazi aracı\n"
                       +"B/b - Binek aracı\n"
                       +"S/s - Spor aracı";
                       System.out.println(araçtipi);
                       System.out.println("*********************");

        System.out.print("Aracınızın tipini seçin:");
        char araç_tipi=scanner.next().charAt(0);

        switch(araç_tipi){
            case 'a':
            case 'A':
            System.out.println("Arazi arabaları gün başına 50 TL");
            break;
            case 'b':
            case 'B':
            System.out.println("Binek arabaları gün başına 70 TL");
            break;
            case 's':
            case 'S':
            System.out.println("Spor arabaları gün başına 150 TL");
            break;
            default:
            System.out.println("Geçersiz seçim...");
        }
    }
}
