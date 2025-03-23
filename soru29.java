import java.util.Scanner;

public class soru29 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.print("Bir ay girin:");
        int ay=scanner.nextInt();

        switch(ay){
            case 12:
            case 1:
            case 2:
            System.out.println("Girdiğiniz ay Kış mevsimine aittir...");
            break;
            case 3:
            case 4:
            case 5:
            System.out.println("Girdiğiniz ay İlkbahar mevsimine aittir...");
            break;
            case 6:
            case 7:
            case 8:
            System.out.println("Girdiğiniz ay Yaz mevsimine aittir...");
            break;
            case 9:
            case 10:
            case 11:
            System.out.println("Girdiğiniz ay Sonbahar mevsimine aittir...");
            break;
            default:
            System.out.println("Yanlış bir giriş yaptınız...");
        }
    
    }
}
