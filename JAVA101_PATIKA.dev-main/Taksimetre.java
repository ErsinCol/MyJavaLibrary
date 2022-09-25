import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Gidilen mesafeyi km cinsinden giriniz: ");
        int km=input.nextInt();
        double perKm=2.20;
        int startPrice=10;
        double total=(km*perKm);
        total+=startPrice;
        total=(total<=20)?20:total;
        System.out.println("Taksimetre tutarı: "+total+" TL");
    }
}
