import java.util.Scanner;

public class KdvAmount {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Para değerini giriniz: ");
        int tutar=input.nextInt();
        double kdvTutarı;
        if(tutar>=0 && tutar<=1000){
            kdvTutarı=tutar*0.18;
        }else {
            kdvTutarı=tutar*0.08;
        }
        double kdvliTutar=tutar+kdvTutarı;
        System.out.println("KDV'siz fiyat: "+tutar);
        System.out.println("KDV tutarı: "+kdvTutarı);
        System.out.println("KDV'li fiyatı: "+kdvliTutar);
    }
}
