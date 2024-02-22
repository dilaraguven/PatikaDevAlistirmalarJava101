import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hipotenusunun hesaplanmasını istediginiz ucgenin kenarlarını giriniz");
        System.out.println("1.kenar:");
        int kenar1= sc.nextInt();
        System.out.println("2.kenar");
        int kenar2=sc.nextInt();

        double hipotenus=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));

        System.out.println("Kenarları girilen ucgenin hipotenusu: "+hipotenus);


    }
}
