import java.util.Scanner;

public class soru24 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.print("Plaka kodu girin:");
        int plaka=scanner.nextInt();

        if((plaka==06)||(plaka==6)){
            System.out.println("Plaka Ankara'ya aittir...");
        }
        else if(plaka==34){
            System.out.println("PLaka İstanbul'a aittir...");
        }
        else if(plaka==35){
            System.out.println("Plaka İzmir'e aittir...");
        }
        else if(plaka==45){
            System.out.println("Plaka MAnisa'ya aittir...");
        }
        else{
            System.out.println("Tanımsız plaka kodu...");
        }
    }
}
