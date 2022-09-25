import java.util.Scanner;

public class ActivityByWeather {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz");
        int heat=input.nextInt();
        if(heat<5)
        {
            System.out.println("Kayak yapmaya gidebilirsiniz...");
        }
        if(heat>5 && heat<=10){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if(heat>10 && heat<=15){
            System.out.println("Sinema ve pikniğe gidebilirsiniz.");
        }
        if(heat>15 && heat<=25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        if(heat>25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }


    }
}
