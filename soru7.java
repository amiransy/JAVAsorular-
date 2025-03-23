import java.util.Scanner;
public class soru7 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Birinci sayıyı girin:");
        int sayı1=scanner.nextInt();
        System.out.println("İkinci sayıyı girin:");
        int sayı2=scanner.nextInt();
        System.out.println("Sayıların toplamı:"+(sayı1+sayı2));
        System.out.println("Sayıların farkı:"+(sayı1-sayı2));
        System.out.println("Sayıların  çarpımı:"+(sayı1*sayı2));
        System.out.println("Sayıların bölümü:"+ (double) (sayı1/sayı2));
    }
}
