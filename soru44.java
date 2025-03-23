import java.util.Scanner;

public class soru44 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        int sayı,i;
        int faktöriyel=1;

        System.out.println("Faktöriyelini bulmak istediğiniz sayıyı girin:");
        sayı=scanner.nextInt();

        if(sayı>0){
            for(i=sayı;i>0;i--){
                faktöriyel*=i;
            }
            System.out.println(+sayı+"!="+faktöriyel);
        }
        else{
            System.out.println("Hata!...0'dan küçük sayı girdiniz...");
        }
    }
}
