import java.util.Scanner;

public class Recursion {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number=scanner.nextInt();
        System.out.print("Faktöriyel: "+factorial(number));
    }
    public static int factorial(int number){
        if(number==1){
            return 1;
        }
        return number*factorial(number-1);
    }
}
