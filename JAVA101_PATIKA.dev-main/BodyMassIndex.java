import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        int weight=input.nextInt();
        System.out.print("Boyunuzu metre cinsinde giriniz: ");
        double height=input.nextDouble();
        double bmi=weight/(Math.pow(height,2));
        System.out.print("Vücut kitle endeksiniz: "+bmi);
    }
}
