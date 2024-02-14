import java.util.Scanner;

public class Donguler3 {
    public static void main(String[] args){
       // Java donguler ile girilen sayiya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdiran programi yazıyoruz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Sayı girin:");
        int sayi= sc.nextInt();

        System.out.println("4'un kuvvetleri");
        for (int i=1;i<=sayi;i*=4)
            System.out.print(i +"  " );
        System.out.println();
        System.out.println("5'in kuvvetleri");
        for (int i=1;i<=sayi;i*=5)
            System.out.print(i +"  " );
    }
}
