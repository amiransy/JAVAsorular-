import java.util.Scanner;

public class soru47 {
    public static void main(String[] args) {
        

        Scanner scanner=new Scanner(System.in);
        int i=0;
        int sayı;

        System.out.print("Bir sayı girin:");
        sayı=scanner.nextInt();

        do{
           i++;
           System.out.print(i+" ");
        }
        while(i<sayı);
    }
}
