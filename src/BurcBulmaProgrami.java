import java.util.Scanner;

public class BurcBulmaProgrami {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen kacinci ayda dogdugunuzu giriniz");
        int ay=sc.nextInt();
        System.out.println("Lutfen dogdugunuz gunu giriniz");
        int gun=sc.nextInt();

        if (ay==1){
            if (gun>0 && gun<=31){
                if (gun<22)
                    System.out.println("Oglak burcusunuz");
                if (gun>=22)
                    System.out.println("Kova burcusunuz");
            }
            else
                System.out.println("Gecersiz gun girdiniz");
        }
        if (ay==2){
            if (gun>0&&gun<=28){
                if (gun<20)
                    System.out.println("Kova burcusunuz");
                if (gun>=20 )
                    System.out.println("Balık burcusunuz");
            }
            else
                System.out.println("Gecersiz gun girdiniz");
        }
        if (ay==3){
            if (gun>0&&gun<=31){
                if (gun<21)
                    System.out.println("Balik burcusunuz");
                if (gun>=21)
                    System.out.println("Koc burcusunuz");
            }
            else
                System.out.println("Gecersiz gun girdiniz");
        }
        if (ay==4){
            if (gun>0&&gun<=30){
                if (gun<21)
                    System.out.println("Koc burcusunuz");
                if (gun>=21)
                    System.out.println("Boga burcusunuz");
            }
            else
                System.out.println("Gecersiz gun girdiniz");
        }
        if (ay==5){
            if (gun>0&&gun<=31){
                if (gun<22)
                    System.out.println("Boga burcusunuz");
                if (gun>=22)
                    System.out.println("İkizler burcusunuz");
            }
            else
                System.out.println("Gecersiz gun girdiniz");
        }
        if (ay==6){
            if (gun>0&&gun<=30){
                if (gun<23)
                    System.out.println("İkizler burcusunuz");
                if (gun>=23)
                    System.out.println("Yengec burcusunuz");
            }
            else
                System.out.println("Gecersiz gun girdiniz");
        }
        if (ay==7){
            if (gun>0&&gun<=31){
                if (gun<23)
                    System.out.println("Yengec burcusunuz");
                if (gun>=23)
                    System.out.println("Aslan burcusunuz");
            }
            else
                System.out.println("Gecersiz gun girdiniz");
        }
        if (ay==8){
            if(gun>0&&gun<=31){
                if (gun<23)
                    System.out.println("Aslan burcusunuz");
                if (gun>=23 )
                    System.out.println("Basak burcusunuz");
            }
            else
                System.out.println("Gecersiz gun girdiniz");
        }
        if (ay==9){
            if (gun>0&&gun<=30){
                if (gun<23)
                    System.out.println("Basak burcusunuz");
                if (gun>=23)
                    System.out.println("Terazi burcusunuz");
            }
            else
                System.out.println("Gecersiz gun girdiniz");
        }
        if (ay==10){
            if (gun>0&&gun<=31){
                if (gun<23)
                    System.out.println("Terazi burcusunuz");
                if (gun>=23)
                    System.out.println("Akrep burcusunuz");
            }
            else
                System.out.println("Gecersiz gun girdiniz");
        }
        if (ay==11){
            if (gun>0&&gun<=30) {
                if (gun<22)
                    System.out.println("Akrep burcusunuz");
                if (gun>=23)
                    System.out.println("Yay burcusunuz");
            }
            else
                System.out.println("Gecersiz gun girdiniz");
        }
        if (ay==12){
            if (gun>0&&gun<=31){
                if (gun<22)
                    System.out.println("Yay burcusunuz");
                if (gun>=23)
                    System.out.println("Oglak burcusunuz");
            }
            else
                System.out.println("Gecersiz gun girdiniz");
        }

    }

}
