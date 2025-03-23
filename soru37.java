import java.util.Scanner;

public class soru37{
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        int i;
        int toplam=0;
        do{
            System.out.print("Bir sayı girin:");
            i=scanner.nextInt();
            toplam+=i;
        }
        while(i!=0);
            System.out.print("Girdiğiniz sayıların toplamı:"+toplam);
    }
}