import java.util.Scanner;

public class soru28 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.print("A harfini girin:");
        char harf=scanner.next().charAt(0);

        switch(harf){
            case 'a':
            case 'A':
            System.out.println("A harfini girdiniz...");
            break;
            default:
            System.out.println("A harfi dışında bir karakter girdiniz...");
        }
    }
}
