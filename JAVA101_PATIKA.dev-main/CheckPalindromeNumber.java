import java.util.Scanner;

public class CheckPalindromeNumber {

    static void checkPalindromeNumber(int number){
        int tempNumber=number;
        int reverseNumber;
        int sum=0;
        while(number>0){
            reverseNumber=number%10; // sayının sondaki basamağını tutuyoruz
            sum=(sum*10)+reverseNumber; // her sağa doğru gidişte 10la çarpıp sayıyı 10 üstünde genişletip son basamağı oluşan basmaağa yazıyoruz
            number/=10; // sayıyı bir bir düşürüyoruz
        }
        if(sum==tempNumber){
            System.out.println("Palindrom sayıdır...");
        }else{
            System.out.println("Palindrom sayı değildir...");
        }

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number=input.nextInt();
        checkPalindromeNumber(number);
    }
}
