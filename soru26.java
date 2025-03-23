import java.util.Scanner;

public class soru26 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.print("Bir harf girin:");
        char harf=scanner.next().charAt(0);

        switch(harf){
            case 'a':
            System.out.println("A harfine bastınız... ");
            break;
            case 'b':
            System.out.println("B harfine bastınız...");
            break;
            case 'c':
            System.out.println("C harfine bastınız...");
            break;
            default:
            System.out.println("Klavyede a,b,c dışında bir harfe bastınız...");
        }
    }
}
