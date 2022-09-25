import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number=input.nextInt();
        int tempNumber=number;
        int basDegeri,basPow;
        int result=0;
        int n=0;
        while(tempNumber!=0) {
            tempNumber /= 10;
            n++; // kaç basamaklı
        }

        tempNumber=number;
        while(tempNumber!=0){
            basDegeri=tempNumber%10;
            basPow=1;
            for(int i=1;i<=n;i++){
                basPow*=basDegeri;
            }
            result+=basPow;
            tempNumber/=10;
        }

        if(result==number){
            System.out.println(number+ " sayısı bir amstrong sayıdır.");
        }else{
            System.out.println(number+" sayısı bir armstrong sayı değildir");
        }


    }
}
