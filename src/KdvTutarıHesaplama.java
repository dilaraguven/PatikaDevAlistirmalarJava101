import java.util.Scanner;

public class KdvTutarıHesaplama {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("KDV hesaplama programına hoş geldiniz." +"\n"+
                "Lütfen hesaplanmasını istediginiz fiyatı giriniz" );
        double fiyat=sc.nextDouble();
        double kdvYuzdesi= ((fiyat<=1000)?0.18:0.08);
        double kdvTutari=fiyat*kdvYuzdesi;
        double kdvliFiyat=kdvTutari+fiyat;

        System.out.println("KDV'siz fiyat "+fiyat);
        System.out.println("KDV'li fiyat "+kdvliFiyat);
        System.out.println("KDV tutarı "+kdvTutari);
    }
}
