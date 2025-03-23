import java.util.Scanner;

public class soru19 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("İlk sayıyı girin:");
        int a=scanner.nextInt();
        System.out.println("İkinci sayıyı girin:");
        int b=scanner.nextInt();

        if(a>b){
            System.out.println("Büyük sayı: "+a+" ve diğer sayıdan olan farkı: "+(a-b));
        }
        else if(b>a){
            System.out.println("Büyük sayı: "+b+" ve diğer syaıdna olan farkı: "+(b-a));
        }
        else {
            System.out.println("Girdiğiniz "+a+" ve "+b+" sayıları eşittir, farkları:"+(a-b));
        }
    }
}
