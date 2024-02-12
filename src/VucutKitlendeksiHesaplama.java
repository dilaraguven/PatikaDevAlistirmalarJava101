import java.util.Scanner;

class VucutKitleIndeksiHesaplama {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu(metre cinsinden)giriniz");
        double boy= sc.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo=sc.nextDouble();
        double vucutKitleİndeksi=kilo/(boy*boy);
        System.out.println("Vucut Kitle İndeksiniz: "+vucutKitleİndeksi);
    }
}
