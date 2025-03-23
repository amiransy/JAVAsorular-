import java.util.Scanner;

public class soru21 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Sayı girin:");
        int sayı=scanner.nextInt();

        if((sayı>10)&&(sayı<50)){
            System.out.println("Girdiğiniz sayı 10 ile 50 arasındadır...");
        }
        else if(sayı<10){
            System.out.println("Girdiğiniz sayı 10'dan küçüktür...");
        }
        else{
            System.out.println("Girdiğiniz sayı 50'den büyüktür...");
        }

    }
}
