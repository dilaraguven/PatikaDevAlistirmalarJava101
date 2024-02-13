import java.util.Scanner;

public class UcakBiletiFiyat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        final double PRICE_PER_DISTANCE= 0.10;
        System.out.print("Mesafeyi km türünden giriniz: ");
        double distance=sc.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        int age=sc.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int tripType= sc.nextInt();
        double price=distance*PRICE_PER_DISTANCE;

        if (age>0 && distance>0 && (tripType==1||tripType==2)) {
            if (age<12)
                price=price/2;
            if (age>=12 && age<=24)
                price=price-(price*0.10);
            if (age>65)
                price=price-(price*0.30);
            else if (tripType==2) {
                price=price-(price*0.20);
                price=price*2;
            }
        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
            System.exit(0);
        }
        System.out.println("Toplam Tutar: "+price);

    }
}
