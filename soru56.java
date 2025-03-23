public class soru56 {
    public static void main(String[] args) {
        int[] grafik = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1};

        for (int i = 0; i < grafik.length; i++) {
            System.out.print(grafik[i] + " --> "); 
            
            for (int j = 0; j < grafik[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
