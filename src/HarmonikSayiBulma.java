import java.util.Scanner;

public class HarmonikSayiBulma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int number = sc.nextInt();
        double result=0;
        for(int i=1;i<=number;i++){
            result+= (double) 1 /i;
        }
        System.out.println(result);

    }
}