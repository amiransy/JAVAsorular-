import java.util.Scanner;

public class soru22 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Birinci kenarı girin:");
        int kenar1=scanner.nextInt();
        System.out.print("İkinci kenarı girin:");
        int kenar2=scanner.nextInt();
        System.out.print("Üçüncü kenarı girin:");
        int kenar3=scanner.nextInt();

        if((kenar1==kenar2)&&(kenar3==kenar1)){
            System.out.println("Bu üçgen Eşkenardır...");
        }
        else if((kenar1==kenar2)||(kenar1==kenar3)||(kenar2==kenar3)){
            System.out.println("Bu üçgen İkizkenardır...");
        }
        else{
            System.out.println("Bu üçgen Çeşitkenardır...");
        }
    }

}
