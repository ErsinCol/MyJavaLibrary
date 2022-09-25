import java.util.Scanner;

public class LoopsDemo2 {
    public static void main(String[] args) {
        // Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        Scanner input=new Scanner(System.in);
        boolean control=true;
        int total=0;
        while (control){
            System.out.print("Sayı giriniz: ");
            int number=input.nextInt();
            if(number%2==0){
                if(number%4==0){
                    total+=number;
                }
            }else{
                control=false;
            }
        }
        System.out.println("Toplam: "+total);
      /*
        Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
         ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        /*
        Scanner input=new Scanner(System.in);
        boolean control=true;
        int total=0;
        while(control){
            System.out.print("Sayı giriniz: ");
            int number=input.nextInt();
            if(number>0){
                if(number%2==1){
                    total+=number;
                }
            }else{
                control=false;
            }
        }
        System.out.println("Girilen sayılardan tek olan değerlerin toplamı: "+total);
         */
    }
}
