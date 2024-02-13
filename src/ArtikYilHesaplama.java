import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen sorgulanmasını istediginiz yili giriniz");
        int year=sc.nextInt();

        if (year%4==0){
          if(year%100==0){
              if (year%400==0) {
                  System.out.println("Girdiginiz yil artik yildir");
              }
              else {
                  System.out.println("Girdiginiz yil artik yil degildir");
                  System.exit(0);
              }

          }
            System.out.println("Girdiginiz yil artik yildir");
        }
        else
            System.out.println("Girdiginiz yil artik yil degildir");
    }
}
