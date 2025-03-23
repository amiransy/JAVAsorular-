import java.util.Scanner;

public class soru17 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        char harf;

        System.out.println("Bir harf giriniz:");
        harf=scanner.next().charAt(0);

        if((harf>='a'&&harf<='z')||(harf>='A'&&harf<='Z')){
            System.out.println("Girdiğiniz "+harf+" harfi alfabede mevcuttur...");
        }
        else{
            System.out.println("Girdiğiniz "+harf+" karakteri alfabede mevcut değildir...");
        }

    }
}
