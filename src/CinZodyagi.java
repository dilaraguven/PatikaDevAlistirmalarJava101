import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Dogum yılınızı giriniz");
        int birthYear= sc.nextInt();
        String zodiac="";
        if (birthYear%12==0)
            zodiac="Maymun";
        if (birthYear%12==1)
            zodiac="Horoz";
        if (birthYear%12==2)
            zodiac="Kopek";
        if (birthYear%12==3)
            zodiac="Domuz";
        if (birthYear%12==4)
            zodiac="Fare";
        if (birthYear%12==5)
            zodiac="Okuz";
        if (birthYear%12==6)
            zodiac="Kaplan";
        if (birthYear%12==7)
            zodiac="Tavsan";
        if (birthYear%12==8)
            zodiac="Ejderha";
        if (birthYear%12==9)
            zodiac="Yılan";
        if (birthYear%12==10)
            zodiac="At";
        if (birthYear%12==11)
            zodiac="Koyun";

        System.out.println("Çin Zodyağı Burcunuz : "+zodiac);



    }
}
