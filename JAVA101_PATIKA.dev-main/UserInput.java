import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz: ");
        String userName=input.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        String password=input.nextLine();
        if(userName.equals("ersin") && password.equals("3003")){
            System.out.println("Giriş başarılı...");
        }else{
            System.out.println("Şifre yanlış...");
            System.out.println("Yeni şifre girmek ister misiniz?\nEvet(1) Hayır(2)");
            int select= input.nextInt();
            if(select==1){
                System.out.print("Yeni şifre: "+input.nextLine());
                String newPassword=input.nextLine();
                if(newPassword.equals("3003")){
                    System.out.println("Şifre eski şifre ile aynı olamaz...");
                }else{
                    System.out.println("Yeni şifre başarılı bir şekilde oluşturuldu...");
                }
            }else if(select==2){
                System.out.println("Tekrar deneyiniz, Bilgiler yanlış...");
            }else{
                System.out.println("Geçersiz bir işlem girdiniz...");
            }
        }
    }
}
