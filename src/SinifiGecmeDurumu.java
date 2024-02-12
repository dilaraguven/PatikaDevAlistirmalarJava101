import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;

        System.out.println("Matematik notunuzu girin:");
        mat=sc.nextInt();
        System.out.println("Fizik notunuzu girin:");
        fizik=sc.nextInt();
        System.out.println("Turkce notunuzu girin:");
        turkce=sc.nextInt();
        System.out.println("Kimya notunuzu girin:");
        kimya=sc.nextInt();
        System.out.println("Muzik notunuzu girin:");
        muzik=sc.nextInt();
        double ortalama= (double) (mat + fizik + turkce + kimya + muzik) /5;
        System.out.println("Ortalamanız:"+ortalama);
        if (ortalama<55)
            System.out.println("Maalesef kaldınız");
        else
            System.out.println("Tebrikler gectiniz");




    }
}
