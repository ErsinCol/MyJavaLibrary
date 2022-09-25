import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci sayı giriniz: ");
        int number1=input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int number2=input.nextInt();
        int i=number2;
        int ebob=1;
        while (i>=1){
            if(number1%i==0 && number2%i==0){
                ebob=i;
                break;
            }
            i--;
        }
        int j=1;
        int ekok=number1*number2;
        while(j<number1*number2){
            if(j%number1==0 && j%number2==0){
                ekok=j;
                break;
            }
            j++;
        }
        System.out.println("EBOB: "+ebob);
        System.out.println("EKOK: "+ekok);
    }
}
