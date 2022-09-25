import java.util.Scanner;

public class FiboRecursive {

    static int fibonacci(int number){
        if (number<=1) {
            return number;
        }
        else {
            return fibonacci(number-1)+fibonacci(number-2);
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int n=input.nextInt();
        System.out.println(fibonacci(n));
    }

}
