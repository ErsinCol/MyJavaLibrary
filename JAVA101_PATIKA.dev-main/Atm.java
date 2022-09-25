import java.util.Scanner;
import java.util.SortedMap;

public class Atm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int right=3;
        int select;
        int balance=1500;
        int price;
        while(right>0){
            System.out.print("Kullanıcı adınızı giriniz: ");
            String userName=input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            String password=input.nextLine();
            if(userName.equals("ersin") && password.equals("3003")){
                System.out.println("Merhaba kodluyoruz bankasına hoşgeldiniz...");
                do{
                    System.out.println("1-Para yatırma\n"+"2-Para Çekme\n"+"3-Bakiye sorgulama\n"+"4-Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select=input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktarı: ");
                            price=input.nextInt();
                            balance+=price;
                            System.out.println("Güncel bakiyeniz: "+balance);
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            price=input.nextInt();
                            if(price>balance){
                                System.out.println("Bakiye yetersiz...");
                            }else{
                                balance-=price;
                                System.out.println("Güncel bakiyeniz: "+balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance);
                            break;
                    }
                }while (select!=4);
                System.out.println("Tekrar görüşmek üzere...");
                break;
            }else{
                right--;
                System.out.println("Bilgileri hatalı girdiniz lütfen tekrar deneyiniz...");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen bankanız ile iletişime geçiniz...");
                }else{
                    System.out.println("Kalan hakkınız: "+right);
                }
            }
        }
    }
}
