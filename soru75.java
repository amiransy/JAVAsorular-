import java.util.Scanner;
public class soru75 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        System.out.print("Üçüncü sayıyı girin: ");
        double sayi3 = scanner.nextDouble();

        System.out.print("Sayıların almak istediğiniz kuveti:");
        int kuvvet=scanner.nextInt();

        double kuvvet1 = Math.pow(sayi1,kuvvet);
        System.out.println("\n"+sayi1 + " sayısının "+kuvvet+".kuvveti= " + kuvvet1);
        double kuvvet2=Math.pow(sayi2,kuvvet);
        System.out.println(sayi2+ " sayısının "+kuvvet+".kuvveti:"+ kuvvet2);
        double kuvvet3=Math.pow(sayi3,kuvvet);
        System.out.println(sayi3+" sayısının "+kuvvet+".kuvveti:"+kuvvet3);

        System.out.println("\n"+sayi1 + " sayısının en küçük tam sayısı (ceil): " + Math.ceil(sayi1));
        System.out.println(sayi2 + " sayısının en küçük tam sayısı (ceil): " + Math.ceil(sayi2));
        System.out.println(sayi3 + " sayısının en küçük tam sayısı (ceil): " + Math.ceil(sayi3));

        System.out.println("\n"+sayi1 + " sayısının en büyük tam sayısı (floor): " + Math.floor(sayi1));
        System.out.println(sayi2 + " sayısının en büyük tam sayısı (floor): " + Math.floor(sayi2));
        System.out.println(sayi3 + " sayısının en büyük tam sayısı (floor): " + Math.floor(sayi3));

        System.out.println("\n"+sayi1 + " sayısının karekökü: " + Math.sqrt(sayi1));
        System.out.println(sayi2 + " sayısının karekökü: " + Math.sqrt(sayi2));
        System.out.println(sayi3 + " sayısının karekökü: " + Math.sqrt(sayi3));
        
        System.out.println("\n"+sayi1 + " sayısının 10 tabanında logaritması: " + Math.log10(sayi1));
        System.out.println(sayi2 + " sayısının 10 tabanında logaritması: " + Math.log10(sayi2));
        System.out.println(sayi3 + " sayısının 10 tabanında logaritması: " + Math.log10(sayi3));

        scanner.close();
    }
}
