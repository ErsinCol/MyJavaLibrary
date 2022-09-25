import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz: ");
        int dateOfBirth=input.nextInt();
        int mod=dateOfBirth%12;
        String signs=null;
        switch (mod){
            case 0: signs="maymun";break;
            case 1: signs="horoz";break;
            case 2: signs="köpek";break;
            case 3: signs="domuz";break;
            case 4: signs="fare";break;
            case 5: signs="öküz";break;
            case 6: signs="kaplan";break;
            case 7: signs="tavşan";break;
            case 8: signs="ejderha";break;
            case 9: signs="yılan";break;
            case 10: signs="at";break;
            case 11: signs="koyun";break;
        }
        System.out.println("Çin zodyağı burcunuz: "+signs);
    }
}