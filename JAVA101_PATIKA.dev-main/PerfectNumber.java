import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int total=0;
        while(true){
            System.out.print("Bir sayı giriniz: ");
            int number=input.nextInt();
            for(int i=1;i<number;i++){
                if(number%i==0){
                    total+=i;
                }
            }
            if(total==number){
                System.out.println(number+" Mükemmel sayıdır.");
            }else{
                System.out.println(number+" Mükemmel sayı değildir.");
            }
            total=0;
        }

    }
}
