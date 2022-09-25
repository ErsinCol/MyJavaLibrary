import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number=input.nextInt();
        for(int x=0;x<number;x++){
            for(int y=x;y<number-1;y++){
                System.out.print(" ");
            }
            for(int z=0;z<(2*x)+1;z++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=number-1;i>=0;i--){
            for(int j=0;j<(number-1)-i+1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++){
                System.out.print("*");
            }
            System.out.println();
        }





















        /*for(int i=1;i<=number;i++){

            for(int j=i;j<=number-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }*/


    }
}
