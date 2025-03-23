import java.util.Scanner;

public class soru45{
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        int i=0, toplam=0, n;

        System.out.println("N sayısını girin:");
        n=scanner.nextInt();

        while(i<=n){
            toplam+=i*i;
            i++;
        }
        System.out.println("Toplam:"+toplam);
    }
}
