import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int startValue=10;
        double km;
        double tutar;
        System.out.println("Kilometre giriniz");
        km= sc.nextDouble();
        tutar=km*2.20+startValue;
        System.out.println("Odenecek Ucret: "+(tutar<20?20:tutar));
    }
}
