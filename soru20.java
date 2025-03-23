import java.util.Scanner;

public class soru20 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Notunuzu girin:");
        double not=scanner.nextDouble();

        if(not>90){
            System.out.println("AA aldınız...");
        }
        else if((not>85)&&(not<=90)){
            System.out.println("BA aldınız...");
        }
        else if((not>80)&&(not<=85)){
            System.out.println("BB aldınız...");
        }
        else if((not>75)&&(not<=80)){
            System.out.println("CB aldınız...");
        }
        else if((not>70)&&(not<=75)){
            System.out.println("CC aldınzı...");
        }
        else if((not>65)&&(not<=70)){
            System.out.println("DC aldınız...");
        }
        else if((not>60)&&(not<=65)){
            System.out.println("DD aldınız...");
        }
        else if((not<60)&&(not>=0)){
            System.out.println("Dersten kaldınız...");
        }
        else{
            System.out.println("Geçersiz not girişi...");
        }
    }
}
