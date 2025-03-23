import java.util.Scanner;

public class soru12 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        int ank_ist=453;
        System.out.print("Ankara-İstanbul arası varış sürenizi girin (saat cinsinden):");
        float varış_süresi=scanner.nextFloat();

        float hız=ank_ist/varış_süresi;
        System.out.println("Arabanın ortalama hızı:"+hız+"km/saat");
    }
}
