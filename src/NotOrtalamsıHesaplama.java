import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NotOrtalamsıHesaplama {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner sc=new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        mat= sc.nextInt();
        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik= sc.nextInt();
        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya= sc.nextInt();
        System.out.println("Turkce Notunuzu Giriniz: ");
        turkce= sc.nextInt();
        System.out.println("Tarih Notunuzu Giriniz: ");
        tarih= sc.nextInt();
        System.out.println("Muzik Notunuzu Giriniz: ");
        muzik= sc.nextInt();

        double ort = (double) (mat + fizik + kimya + turkce + tarih + muzik) /6;
        System.out.println("Not ortalamanız:"+ort+"\t"+(ort>=60?"Tebrikler Gectiniz":"Maalesef Kaldınız"));



    }
}