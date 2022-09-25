import java.util.Scanner;

public class GreenGrocer_Cash_Program {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double pearPrice=2.14,applePrice=3.67,tomatoPrice=1.11,bananaPrice=0.95,auberginePrice=5.0;
        System.out.print("Armut kaç kilo? :");
        int pearAmount=input.nextInt();
        System.out.print("Elma kaç kilo? :");
        int appleAmount=input.nextInt();
        System.out.print("Domates kaç kilo? :");
        int tomatoAmount=input.nextInt();
        System.out.print("Muz kaç kilo? :");
        int bananaAmount=input.nextInt();
        System.out.print("Patlıcan kaç kilo? :");
        int aubergineAmount=input.nextInt();
        double total=(pearPrice*pearAmount)+(applePrice*appleAmount)+(tomatoPrice*tomatoAmount)+(bananaPrice*bananaAmount)+(auberginePrice*aubergineAmount);
        System.out.print("Toplam alışveriş tutarı: "+total);
    }
}
