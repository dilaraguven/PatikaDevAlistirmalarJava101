import java.util.Scanner;

public class DaireninAlaniVeCevresi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

//        double pi=3.14;
//        System.out.println("Hesaplanmasını istediginiz dairenin yarıcapini giriniz");
//        double r= sc.nextDouble();
//        double alan=pi*r*r;
//        double cevre=2*pi*r;
//        System.out.println("Dairenin alanı: "+alan+"\t"+"Dairenin cevresi: "+cevre);

        double pi=3.14;
        double r;
        double aci;

        System.out.println("Hesaplanmasını istediginiz daire diliminin yarıcapini ve merkez acisini giriniz");
        System.out.println("Yaricap: ");
        r= sc.nextDouble();
        System.out.println("Merkez Aci:");
        aci= sc.nextDouble();
        double sonuc=(pi*(r*r)*aci)/360;
        System.out.println("Daire diliminin alani: "+sonuc);





    }
}
