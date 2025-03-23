import java.util.Scanner;
public class soru10 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Brut ücreti girin:");
        int brut_ücret=scanner.nextInt();
        System.out.println("Vergi oranını girin:");
        double vergi_oranı=scanner.nextDouble();

        double net_ücret=brut_ücret-brut_ücret*vergi_oranı;

        System.out.println("Net ücretiniz:"+net_ücret);
    }
}
