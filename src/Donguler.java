
import java.util.Scanner;

public class Donguler {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi=sc.nextInt();
        int sayilarToplam=0;
        int count=0;

        for (int i=0;i<sayi;i++){
            if (i%3==0 && i%4==0){
               sayilarToplam+=i;
               count++;
            }
        }
        double ort= (double) sayilarToplam /(count-1);
        System.out.println("Sayıların toplamı:"+sayilarToplam);
        System.out.println("Ortalma: "+ort);
    }
}
