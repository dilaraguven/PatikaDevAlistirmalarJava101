import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num1,num2,choice;
        double sonuc;
        System.out.println("Birinci sayıyı giriniz:");
        num1= sc.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        num2=sc.nextInt();
        System.out.println("Toplama:1\tCıkarma:2\tCarpma:3\tBolme:4");
        choice=sc.nextInt();
        switch (choice){
            case 1:
                sonuc=num1+num2;
                System.out.println("Girdiginiz sayıların toplamı: "+sonuc);
              break;
            case 2:
                sonuc=num1-num2;
                System.out.println("Girdiginiz sayıların farkı: "+sonuc);
                break;
            case 3:
                sonuc=num1*num2;
                System.out.println("Girdiginiz sayıların carpimi: "+sonuc);
                break;
            case 4:
                if (num2!=0) {
                    sonuc = (double) num1 / num2;
                    System.out.println("Girdiginiz sayıların bolumu: " + sonuc);
                    break;
                }
                else
                    System.out.println("Bir sayı 0'a bolunemez");
                break;
            default:
                System.out.println("Gecersiz sayı girdiniz");
                break;




        }


    }
}
