import java.util.Scanner;

public class Donguler2 {
//    Java donguler ile tek bir sayi girilene kadar kullanicidan girişleri kabul
//    eden ve girilen degerlerden çift ve 4'un katları olan sayıları toplayıp ekrana basan programi yaziyoruz.

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sayi;
        int toplam=0;

        do {
            System.out.println("Sayı giriniz");
            sayi= sc.nextInt();
            if (sayi%4==0){
                toplam+=sayi;
            }
        }while (sayi%2==0);
        System.out.println("Toplam:"+toplam);
    }
}
