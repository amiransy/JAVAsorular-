import java.util.Random;
public class soru73 {
    public static void main(String[] args) {

        Random random = new Random();

        int rastgeleSayi = random.nextInt(6) + 1;

        System.out.println("Üretilen rastgele sayı: " + rastgeleSayi);
    }
}
