public class soru43 {
    public static void main(String[] args) {
        
        int i;
        int toplam=0;

        for(i=1;i<=50;i++){
            if(i%2==0)
                toplam+=i;
        }
        System.out.println("1-50 aralığındaki çift sayıların toplamı: "+toplam);
    }
}
