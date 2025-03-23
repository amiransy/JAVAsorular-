import java.util.Scanner;

public class soru18 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int a,b;

        System.out.println("İlk sayıyı girin:");
        a=scanner.nextInt();
        System.out.println("İkinci sayıyı girin:");
        b=scanner.nextInt();

        if(a>b){
            System.out.println("Büyük sayı:"+a);
        }
        else if(b>a){
            System.out.println("Büyük sayı:"+b);
        }
        else{
            System.out.println(a+" ve "+b+" eşittir");
        }


    }
}
