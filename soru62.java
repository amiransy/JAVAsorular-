public class soru62 {
    public static void main(String[] args) {

        int[][] matrix = {
            {5, 3, 7, 2},
            {8, 6, 1, 4},
            {9, 0, 3, 5},
            {4, 3, 7, 1},
            {8, 2, 6, 4}
        };
        
        int mindeğer = matrix[0][0];
        int minsatır = 0;
        int minsütun = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < mindeğer) {
                    mindeğer = matrix[i][j];
                    minsatır = i;
                    minsütun = j;
                }
            }
        }
        System.out.println("En küçük eleman: " + mindeğer);
        System.out.println("Satır indeksi: " + minsatır);
        System.out.println("Sütun indeksi: " + minsütun);
    }
}
