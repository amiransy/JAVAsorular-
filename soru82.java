public class soru82 {

    public static String hosgeldinizMesaji() {
        return "Hoş Geldiniz";
    }
    public static String dersAdi() {
        return "Nesneye Yönelik Programlama";
    }
    public static String tamMesaj() {
        return dersAdi() + " " + hosgeldinizMesaji();
    }
    public static void mesajYazdir() {
        System.out.println(tamMesaj());
    }

    public static void main(String[] args) {
        mesajYazdir();
    }
}
