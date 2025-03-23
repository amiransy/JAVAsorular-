public class soru83 {
    public static void main(String[] args) {
        double[] sayilar = {12.34567, 78.91011, 34.56789, 56.78901, 90.12345};

        System.out.println("Dizi içerisindeki sayılar (%.2f formatında):");
        for (double sayi : sayilar) {
            System.out.printf("%.2f%n", sayi);
        }
    }
}
