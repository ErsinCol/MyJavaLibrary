import java.util.Scanner;

public class PlaneTicketPrice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        int distance=input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        int age=input.nextInt();
        System.out.println("(1 =>Tek yön, 2=>Çift yön)\nYolculuk tipini giriniz:");
        int select=input.nextInt();
        if(distance>0 && age>0 && select==1 || select==2){
            double ticketPrice=distance*0.10;
            if(age<=12){
                ticketPrice-=ticketPrice*0.50;
            }else if(age>12 && age<=24){
                ticketPrice-=ticketPrice*0.10;
            }else if(age>65){
                ticketPrice-=ticketPrice*0.30;
            }

            if(select==2){
                ticketPrice*=2;
                ticketPrice-=ticketPrice*0.20;
            }
            System.out.println("Bilet fiyatı: "+ticketPrice);
        }else{
            System.out.println("Hatalı veri girdiniz...");
        }


    }
}
