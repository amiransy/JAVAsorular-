import java.util.Scanner;

public class soru13 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("İlk sayıyı girin:");
        int a=scanner.nextInt();
        System.out.println("İkinci sayıyı girin:");
        int b=scanner.nextInt();
        System.out.println("Üçüncü sayıyı girin:");
        int c=scanner.nextInt();

        int üçhaneli_sayı=a*100+b*10+c;

        System.out.println("Üç haneli sayınız:"+üçhaneli_sayı);
    }
}
