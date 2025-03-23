import java.util.Scanner;

public class soru11 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Havuzun eni, boyu, yüksekliği:");
        int eni=scanner.nextInt();
        int boyu=scanner.nextInt();
        int yüksekliği=scanner.nextInt();

        double hacim=eni*boyu*yüksekliği;
        System.out.println("Havuz "+hacim+" mertreküp su alabilir.");
    }
}
