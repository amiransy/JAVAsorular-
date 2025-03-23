public class soru58 {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {11, 34, 42, 60},
            {72, 99, 10, 50},
            {80, 66, 21, 38}
        };
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
