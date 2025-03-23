public class soru81 {

    // Üç kelimeyi birleştirip tek bir metin döndüren fonksiyon
    public static String birlestir(String kelime1, String kelime2, String kelime3) {
        return kelime1 + " " + kelime2 + " " + kelime3;
    }

    // birlestir fonksiyonunu çağıran ve sonucu ekrana yazdıran fonksiyon
    public static void birlestirVeYazdir() {
        String sonuc = birlestir("Nesneye", "Yönelik", "Programlama");
        System.out.println("Birleştirilmiş metin: " + sonuc);
    }

    public static void main(String[] args) {
        // birlestirVeYazdir fonksiyonunu çağırma
        birlestirVeYazdir();
    }
}
