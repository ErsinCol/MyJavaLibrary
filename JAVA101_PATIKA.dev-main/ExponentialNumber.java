import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        double base=input.nextDouble();
        System.out.print("Üs değerini giriniz: ");
        double power=input.nextDouble();
        double answer=1;
        if(power==0){
            System.out.println("Answer: "+answer);
        }else if(power>0){
            for(int i=1;i<=power;i++){
                answer*=base;
            }
            System.out.println("Answer: "+answer);
        }else if(power<0){
            base=1/base;
            power*=-1;
            for(int i=1;i<=power;i++){
                answer*=base;
            }
            System.out.println("Answer: "+answer);
        }

    }
}
