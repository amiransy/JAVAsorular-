import java.util.Scanner;

public class soru33 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        int toplam=0;

        System.out.print("Başlangıç değeri girin:");
        int başlangıç=scanner.nextInt();
        System.out.print("Bitiş değeri girin:");
        int bitiş=scanner.nextInt();

        for(int i=başlangıç;i<=bitiş;i++){
             toplam +=i;
        }
        System.out.println("Toplam:"+toplam);
    }
}
