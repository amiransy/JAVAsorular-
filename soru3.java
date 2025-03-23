import java.util.Scanner;
public class soru3 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int a,alan;
        System.out.println("Karenin kenar uzunluğunu girin:");
        a=scanner.nextInt();
        alan=a*a;
        System.out.println("Kenar uzunluğunu girdiğiniz karenin alanı:"+alan);
    }
}
