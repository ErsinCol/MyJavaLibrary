import java.util.Scanner;

public class LoopsDemo1 {
    public static void main(String[] args) {
        // Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number=input.nextInt();
        int total=0;
        int sayac=0;
        for(int i=0;i<number;i++){
            if(i%3==0 && i%4==0){
                total+=i;
                sayac++;
            }
        }
        double average=total/sayac;
        System.out.println("Ortalaması: "+average);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz

        System.out.print("Bir sayı giriniz: ");
        int number=input.nextInt();
        for(int i=0;i<number;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        */

    }
}
