import java.util.Scanner;

public class soru27 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.print("1-3 aralığında br tam sayı girin:");

        int sayı=scanner.nextInt();

        switch(sayı){
            case 1:
            System.out.println("1 sayısını girdiniz...");
            break;
            case 2:
            System.out.println("2 sayısını girdiniz...");
            break;
            case 3:
            System.out.println("3 sayısını girdiniz...");
            break;
            default:
            System.out.println("1-3 aralığı dışında bir değer girdiniz...");
        }
    }
}
