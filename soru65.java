public class soru65 {
    public static void main(String[] args) {

        int[][] notlar = {
            {77, 68, 86, 73}, 
            {96, 87, 89, 78}, 
            {70, 90, 86, 81} 
        };

        int enYuksekNot = Integer.MIN_VALUE;
        int enDusukNot = Integer.MAX_VALUE;
        double[] ortalamalar = new double[3]; 

        for (int i = 0; i < 3; i++) {
            int toplam = 0;
            for (int j = 0; j < 4; j++) {
                if (notlar[i][j] > enYuksekNot) {
                    enYuksekNot = notlar[i][j];
                }
                if (notlar[i][j] < enDusukNot) {
                    enDusukNot = notlar[i][j];
                }
                toplam += notlar[i][j]; 
            }
            ortalamalar[i] = toplam / 4.0;
        }
        System.out.println("Öğrenci Notları:");
        
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + ". öğrenci notları: ");
            for (int j = 0; j < 4; j++) {
                System.out.print(notlar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nEn Yüksek Not: " + enYuksekNot);
        System.out.println("En Düşük Not: " + enDusukNot);
        System.out.println("\nÖğrenci Ortalamaları:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d. öğrenci ortalaması: %.2f\n", (i + 1), ortalamalar[i]);
        }
    }
}
