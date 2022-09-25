import java.util.Scanner;

public class RecursivePower {

    static int recursivePower(int base,int power){
        if(power==0){
            return 1;
        }
        return base*recursivePower(base,power-1);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.print("Taban değerini giriniz: ");
            int base=input.nextInt();
            System.out.print("Üs değerini giriniz: ");
            int power= input.nextInt();
            System.out.println("Sonuc: "+recursivePower(base,power));
        }
    }
}
