public class soru64 {
    public static void main(String[] args) {

        int[][] matris = {
            {5, 3, 7, 2},
            {8, 6, 1, 4},
            {9, 0, 3, 5},
            {4, 3, 7, 1},
            {8, 2, 6, 4}
        };

        int[] sütunToplamları = new int[4];

        for (int j = 0; j < 4; j++) { 
            for (int i = 0; i < 5; i++) {
                sütunToplamları[j] += matris[i][j];
            }
        }

        for (int j = 0; j < 4; j++) {
            System.out.println("Sütun " + (j + 1) + " toplamı: " + sütunToplamları[j]);
        }
    }
}
