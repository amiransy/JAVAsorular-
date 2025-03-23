public class soru46 {
    public static void main(String[] args) {
        
        int i=0;
        int j;

        while(i<5){
            j=0;
            while(j<i+1){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
