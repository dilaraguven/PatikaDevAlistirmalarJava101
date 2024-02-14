import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ussu alinacak sayıyı giriniz");
        int sayi= sc.nextInt();
        System.out.println("Us olacak sayiyi giriniz");
        int us= sc.nextInt();
        int sonuc=1;
        for (int i=1;i<=us;i++){
            sonuc*=sayi;
        }
        System.out.println("Sonuc: "+sonuc);
    }
}
