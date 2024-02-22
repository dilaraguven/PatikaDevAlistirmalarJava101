import java.util.Scanner;

public class ArmstrongSayiBulma {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number=sc.nextInt();
        int tempNumber=number;
        int basNumber=0;
        int basValue;
        int basPow;
        int result=0;
        int total=0;

        while(tempNumber!=0){
            tempNumber/=10;
            basNumber++;
        }
        tempNumber=number;
        while (tempNumber!=0){
            basValue=tempNumber%10;
            basPow=1;
            for (int i=1;i<=basNumber;i++){
                basPow*=basValue;
            }
            total+=basValue;
            result+=basPow;
            tempNumber/=10;
        }

        System.out.println("Girdiginiz sayilarin basamak sayilarinin toplami: "+total);

        if (number==result)
            System.out.println("Girdiginiz sayi bir armstrong sayidir");
        else
            System.out.println("Girdiginiz sayi birarmstrong sayi degildir");

    }

}
