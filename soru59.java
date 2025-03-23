public class soru59 {
    public static void main(String[] args) {
        int[][] matrixA = {
            {5, 3, 7},
            {0, 1, 2}
        };
        int[][] matrixB = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrixC = new int[2][3];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("Matris A:");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matris B:");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matris C (toplam):");
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
