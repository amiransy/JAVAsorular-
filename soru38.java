import java.util.Scanner;

public class soru38 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        int i;
        int karesi;
        do{
            System.out.print("Bir sayı girin:");
            i=scanner.nextInt();
            karesi=i*i;
            System.out.println("Karesi:"+karesi);
        }
        while(i!=0);
    }
}