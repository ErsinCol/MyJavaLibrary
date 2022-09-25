import java.util.Scanner;

public class find_MinMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int count = input.nextInt();
        System.out.print("1. sayıyı giriniz: ");
        int number = input.nextInt();
        int max = number;
        int min = number;
        for (int i = 2; i <= count; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("En büyük: " + max);
        System.out.println("En küçük: " + min);
    }
}
