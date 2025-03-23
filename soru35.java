import java.util.Scanner;

public class soru35 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        int toplam=0;
        int a=1;

        while(a!=0){
            System.out.print("Sayı girin:");
            a=scanner.nextInt();
            toplam+=a;
        }
        System.out.println("Toplam:"+toplam);
    }
}
