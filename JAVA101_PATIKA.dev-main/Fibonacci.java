import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fibonacci serisinin eleman sayısını giriniz: ");
        int number=input.nextInt();
        int i=0;
        int d1=0,d2=1,d3;
        while(i<=number){
            if(i==0){
                d1=i;
            }
            else if(i==1){
                d2=i;
            }
            else{
                d3=d1+d2;
                System.out.println(d1+" + "+d2+" = "+d3);
                d1=d2;
                d2=d3;
            }
            i++;
        }
    }
}
