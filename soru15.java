import java.util.Scanner;
public class soru15 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        int a,b;

        System.out.println("İlk sayıyı girin:");
        a=scanner.nextInt();
        System.out.println("İkinci sayıyı girin:");
        b=scanner.nextInt();

        if(a>b){
            System.out.println(a+" sayısı "+b+" sayısından büyüktür...");
        }
        if(b>a){
            System.out.println(b+" sayısı "+a+" sayısından büyüktür...");
        }
        if(a==b){
            System.out.println(a+" ve "+b+" eşittir...");
        }
    }
}
