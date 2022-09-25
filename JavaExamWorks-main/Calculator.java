import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        double number1=scanner.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double number2=scanner.nextDouble();
        Calculations calculations=new Calculations(number1,number2);
        System.out.print("Toplama(1)\nÇıkarma(2)\nÇarpma(3)\nBölme(4)\nYapmak istediğiniz işlemi seçiniz: ");
        int islem=scanner.nextInt();
        DecimalFormat frmt=new DecimalFormat("0.##");
        switch (islem){
            case 1: System.out.println("Sonuc: "+ calculations.total()); break;
            case 2: System.out.println("Sonuc: "+calculations.subtract()); break;
            case 3: System.out.println("Sonuc: "+calculations.multiplication()); break;
            case 4: System.out.println("Sonuc: "+frmt.format(calculations.division()) ); break;
            default: System.out.println("Hatalı seçim yaptınız. Geçerli bir işlem giriniz..."); break;
        }


    }
}
