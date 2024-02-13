import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args){
//        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//        Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
//        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen sıcaklıgı giriniz");
        int sicaklik= sc.nextInt();

        if (sicaklik<5)
            System.out.println("Kayak yapabilirsiniz");
        else if ( sicaklik<=25) {
             if (sicaklik <= 15)
                System.out.println("Sinemaya gidebilirsiniz");
             if (sicaklik>=10)
                System.out.println("Piknige gidebilirsiniz");
        }
        if (sicaklik>25)
            System.out.println("Yuzmeye gidebilirsiniz");



    }
}
