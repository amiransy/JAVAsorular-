public class soru70 {
    public static void main(String[] args) {

        String metin1 = "Nesneye ";
        String metin2 = "Yönelik ";
        String metin3 = "Programlama";

        String kopyaMetin1 = new String(metin1);
        String kopyaMetin2 = new String(metin2);
        String kopyaMetin3 = new String(metin3);

        String birlesmisMetin = kopyaMetin1 + kopyaMetin2 + kopyaMetin3;

        System.out.println("\nKopyalanmış ve birleştirilmiş metin: " + birlesmisMetin);
    }
}
