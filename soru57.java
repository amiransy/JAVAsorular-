import java.util.Scanner;

public class soru57 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();

        int[] A = new int[boyut];
        int[] B = new int[boyut];
        int[] C = new int[boyut];

        System.out.println("A dizisinin elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". elemanı girin: ");
            A[i] = scanner.nextInt();
        }
        System.out.println("B dizisinin elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". elemanı girin: ");
            B[i] = scanner.nextInt();
        }
        for (int i = 0; i < boyut; i++) {
            C[i] = A[i] + B[i];
        }
        System.out.println("\nC dizisi (A + B):");
        for (int i = 0; i < boyut; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }

        scanner.close();
    }
}

