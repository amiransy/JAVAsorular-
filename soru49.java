public class soru49 {
    public static void main(String[] args) {
        int[] sayilar = new int[5];
        
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = i * 3;
        }
        System.out.println("Dizi elemanları:");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("sayilar[" + i + "] = " + sayilar[i]);
        }
    }
}

