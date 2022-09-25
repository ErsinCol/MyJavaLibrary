import java.util.Scanner;

public class Uygulama  {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sipais adını giriniz: ");
        String urunAdi=input.nextLine();
        System.out.print("Siparis birim fiyatını giriniz: ");
        int birimFiyatı=input.nextInt();
        System.out.print("Siparis numarasını giriniz: ");
        int siparisNo=input.nextInt();
        System.out.print("Siparis tarihini giriniz: ");
        String siparisTarihi=input.next();
        System.out.print("Siparis miktarını giirniz: ");
        int miktar=input.nextInt();

        Urun urun1=new Urun(urunAdi,birimFiyatı);
        Siparis siparis1=new Siparis(siparisNo,siparisTarihi);
        siparis1.sepeteEkle(urun1,siparis1,miktar);
        siparis1.siparisGoster();

    }
}
