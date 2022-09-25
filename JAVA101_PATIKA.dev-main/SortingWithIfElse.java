import java.util.Scanner;

public class SortingWithIfElse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int number1=input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int number2=input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz: ");
        int number3=input.nextInt();

        if(number1>number2 && number1>number3){
            if(number2>number3){
                System.out.println("s1>s2>s3");
            }else if(number3>number2){
                System.out.println("s1>s3>s2");
            }else{
                System.out.println("s1>s2=s3");
            }
        }
        else if(number2>number1 && number2>number3){
            if(number1>number3){
                System.out.println("s2>s1>s3");
            }else if(number3>number1){
                System.out.println("s2>s3>s1");
            }else{
                System.out.println("s2>s1=s3");
            }
        }
        else if(number3>number1 && number3>number2){
            if(number2>number1){
                System.out.println("s3>s2>s1");
            }else if(number1>number2){
                System.out.println("s3>s1>s2");
            }else{
                System.out.println("s3>s1=s2");
            }
        }
        else if(number1<number2 && number2==number3){
            System.out.println("s2=s3>s1");
        }
        else if(number2<number1 && number1==number3){
            System.out.println("s1=s3>s2");
        }
        else if(number3<number1 && number1==number2){
            System.out.println("s1=s2>s3");
        }
        else{
            System.out.println("s1=s2=s3");
        }

    }
}
