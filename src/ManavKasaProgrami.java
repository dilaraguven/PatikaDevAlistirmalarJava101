import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Manava Hos Geldiniz Almak istediginiz urunlerin kilosunu giriniz");
        System.out.println("Armut Kaç Kilo ?");
        int armut= sc.nextInt();
        System.out.println("Elma Kaç Kilo ?");
        int elma= sc.nextInt();
        System.out.println("Domates Kaç Kilo ?");
        int domates= sc.nextInt();
        System.out.println("Muz Kaç Kilo ?");
        int muz= sc.nextInt();
        System.out.println("Patlıcan Kaç Kilo ?");
        int patlican= sc.nextInt();
        double toplam=armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.00;
        System.out.println("Toplam tutar: "+toplam+"TL");


    }
}
