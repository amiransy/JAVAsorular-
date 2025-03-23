import java.util.Scanner;

public class soru30 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("********** TURİZM ŞİRKETİ **********");

        String turizmşirketi= "1.Orta Avrupa Turu\n"
                             +"2.Güney Amerika Turu\n"
                             +"3.Kuzey Amerika Turu\n"
                             +"4.Uzak Doğu Turu";
                             System.out.println(turizmşirketi);
                             System.out.println("************************************"); 
                             System.out.print("Tur numarası girin:");
                             int tur_numarası=scanner.nextInt();

                             switch(tur_numarası){
                                case 1:
                                System.out.println("Uçak ile Viyana, Budapeşte, Prag Turu");
                                System.out.println("4 yıldızlı otellerde şok fiyat! 1700$");
                                break;
                                case 2:
                                System.out.println("Özel uçak ile Sao Paulo, Rio de Jenairo, Buenos Aires Turu");
                                System.out.println("5 yıldızlı otellerde şok fiyat! 2950$");
                                break;
                                case 3:
                                System.out.println("Özel uçak ile New York, Boston, Los Angeles Turu");
                                System.out.println("5 yıldzılı otellerde şok fiyat! 3700$");
                                break;
                                case 4:
                                System.out.println("Özel uçak ile Bang Kong, Hong Kong, Tokyo, Pekin Turu");
                                System.out.println("5 yıldızlı otellerde şok fiyat! 4000$");
                                break;
                                default:
                                System.out.println("Geçersiz işlem...");
                             }
    }
}
