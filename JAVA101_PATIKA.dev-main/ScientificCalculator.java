import java.util.Scanner;

public class ScientificCalculator {

    static void plus(){
        Scanner input=new Scanner(System.in);
        int i=1;
        int result=0;
        while(true){
            System.out.print(i++ +" .sayıyı giriniz: ");
            int number=input.nextInt();
            if(number==0){
                break;
            }
            result+=number;
        }
        System.out.println("Sonuc: "+result);
    }
    static void minus(){
        Scanner input=new Scanner(System.in);
        int result=0;
        System.out.print("Kaç adet sayı giriceksiniz: ");
        int counter=input.nextInt();
        int number;
        for(int i=1;i<=counter;i++){
            System.out.print(i+" .sayı: ");
            number=input.nextInt();
            if(i==1){
                result+=number;
                continue;
            }
            result-=number;
        }
        System.out.println("Sonuc: "+result);
    }
    static void times(){
        Scanner input=new Scanner(System.in);
        int i=1;
        int result=1;
        while (true){
            System.out.print(i++ +".sayıyı giriniz: ");
            int number=input.nextInt();
            if(number==0){
                result=0;
                break;
            }
            if(number==1){
                break;
            }
            result*=number;
        }
        System.out.println("Sonuc: "+result);
    }
    static void divided(){
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç adet sayı giriceksiniz: ");
        int counter=input.nextInt();
        double result=0.0;
        double number;
        for(int i=1;i<=counter;i++){
            System.out.print(i+ " .sayı: ");
            number=input.nextInt();
            if(i==1){
                result=number;
                continue;
            }
            if(i!=1 && number==0){
                System.out.println("Böleni sıfır giremezsiniz...");
                continue;
            }
            result/=number;
        }
        System.out.println("Sonuc: "+result);
    }
    static void power(){
        Scanner input=new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base=input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int power=input.nextInt();
        int result=1;
        for(int i=1;i<=power;i++){
            result*=base;
        }
        System.out.println("Sonuc: "+result);
    }
    static void factorial(){
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number=input.nextInt();
        int result=1;
        for(int i=1;i<=number;i++){
            result*=i;
        }
        System.out.println("Faktoriyeli: "+result);
    }
    static void mod(){
        Scanner input=new Scanner(System.in);
        System.out.print("Bölünen değerini giriniz: ");
        int number1=input.nextInt();
        System.out.print("Bölen değerini giriniz: ");
        int number2=input.nextInt();
        int result=number1%number2;
        System.out.println("Mod: "+result);
    }
    static void rectangle(){
        Scanner input=new Scanner(System.in);
        System.out.print("Kısa kenar uzunluğunu giriniz: ");
        int k1=input.nextInt();
        System.out.print("Uzun kenar uzunluğunu giriniz: ");
        int k2=input.nextInt();
        int area=k1*k2;
        int perimeter=2*(k1+k2);
        System.out.println("Alan: "+area+", Çevre: "+perimeter);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String menu=
                "1- Toplama işlemi\n"
                +"2- Çıkarma işlemi\n"
                +"3- Çarpma işlemi\n"
                +"4- Bölme işlemi\n"
                +"5- Üslü sayı hesaplama\n"
                +"6- Faktoriyel hesaplama\n"
                +"7- Mod alma\n"
                +"8- Dikdörtgen alan ve çevre hesabı\n"
                +"0- Çıkış yap";
        int select;
        do{
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            select=input.nextInt();
            switch (select){
                case 1: plus();break;
                case 2: minus();break;
                case 3: times();break;
                case 4: divided();break;
                case 5: power();break;
                case 6: factorial();break;
                case 7: mod();break;
                case 8: rectangle();break;
                case 0: break;
                default:
                    System.out.println("Hatalı işlem seçtiniz..."); break;
            }
        }while(select!=0);
    }
}