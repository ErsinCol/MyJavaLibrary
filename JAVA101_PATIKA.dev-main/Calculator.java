import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int number1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int number2=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        int select=input.nextInt();
        switch (select){
            case 1: System.out.println("Sonuc: "+(number1+number2));break;
            case 2: System.out.println("Sonuc: "+(number1-number2));break;
            case 3: System.out.println("Sonuc: "+(number1*number2));break;
            case 4:
                if(number2!=0){
                    System.out.println("Sonuc: "+(number1/number2));break;
                }else{
                    System.out.println("Payda sıfır olamaz.");break;
                }
            default:
                System.out.println("Geçerli bir işlem seçiniz..."); break;
        }
    }
}
