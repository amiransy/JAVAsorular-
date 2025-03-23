import java.util.Scanner;

public class soru23 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.print("Mesafe ölçümü (Mil:m/M veya Kilometre:k/K):");
        char ölçü=scanner.next().charAt(0);
        System.out.print("Kat ettiğiniz mesafe:");
        double mesafe1=scanner.nextDouble();

        if((ölçü=='m')||(ölçü=='M')){
            double mesafe2=mesafe1*1.609344;
            System.out.println(+mesafe1+" Mil = "+mesafe2+" km");
        }
        else if((ölçü=='k')||(ölçü=='K')){
            double mesafe2=mesafe1*0.62137119;
            System.out.println(+mesafe1+" Km = "+mesafe2+" Mil");
        }
        else{
            System.out.println("Geçersiz karakter...");
        }
    }
}
