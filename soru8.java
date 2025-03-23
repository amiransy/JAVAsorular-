import java.util.Scanner;
import java.util.function.DoubleFunction;

public class soru8 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Birinci sayıyı girin:");
        int a=scanner.nextInt();
        System.out.println("İkinci sayıı girin:");
        int b=scanner.nextInt();

        double ortalama=(a+b)/2;

        System.out.println("Girdiğiniz sayların ortalaması:"+ortalama);
        
    }
}
