import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number=input.nextInt();
        int total=0;
        while(number!=0){
            int basDegeri=number%10;
            total+=basDegeri;
            number/=10;
        }
        System.out.println("Basamak değerlerinin toplamı: "+total);
    }
}
