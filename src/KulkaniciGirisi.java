import java.util.Scanner;

public class KulkaniciGirisi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String userName,password;

        System.out.println("Lutfen kullanici adinizi giriniz:");
        userName= sc.next();
        System.out.println("Lutfen sifrenizi giriniz");
        password=sc.next();
        if (userName.equals("dilaraguven") && password.equals("dilara123"))
            System.out.println("Kullanıcı girisi yapıldı");
        else {
            System.out.println("Hatalı kullanıcı adı veya sifre. Sifrenizi sıfırlamak ister misiniz: 1-yes  2-no");
            int choice= sc.nextInt();
            if (choice==1){
                System.out.println("Yeni sifreniz eski sifreniz ve hatalı girilen sifre ile aynı olmalalıdır");
                System.out.print("Yeni sifreniz:");
                String newPassword= sc.next();
                if (newPassword.equals(password)||newPassword.equals("dilara123"))
                    System.out.println("Sifre olusturulamadi. Lutfen baska sifre giriniz");
                else
                    System.out.println("Sifre olusturuldu");
            }
            else if (choice==2)
                System.out.println("Sistemden cıkıs yapılıyor");
            else
                System.out.println("Gecersiz sayı girisi yaptınız.");

        }


    }
}
