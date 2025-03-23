import java.util.Scanner;

public class soru16 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        int x;

        System.out.println("X değeri girin:");
        x=scanner.nextInt();

        if(x%2==0){
            System.out.println("Girdiğiniz değer bir çift sayıdır...");
        }
        else{
            System.out.println("Girdiğiniz değer bir tek sayıdır...");
        }
    }
}
