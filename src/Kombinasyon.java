import java.util.Scanner;

public class Kombinasyon {

    //        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
//        kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
//        Java ile kombinasyon hesaplayan program yazınız.
//        Kombinasyon formülü
//        C(n,r) = n! / (r! * (n-r)!)
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Kumenin eleman sayısını giriniz");
        int n= sc.nextInt();
        System.out.println("Alt kumenin eleman sayisini giriniz");
        int r= sc.nextInt();
        int nFaktoriyel=1;
        int rFaktoriyel=1;
        int n_rFaktoriyel=1;

        for (int i=1;i<=n;i++)
            nFaktoriyel*=i;
        for (int i=1;i<=r;i++)
            rFaktoriyel*=i;
        for (int i=1;i<=(n-r);i++)
            n_rFaktoriyel*=i;

        double kombinasyon= (double) nFaktoriyel /(rFaktoriyel*n_rFaktoriyel);
        System.out.println("Kombinasyon:"+kombinasyon);


    }
}
