import java.text.DecimalFormat;
import java.util.Scanner;

public class KalitimUygulamasi {

    public static void main(String[] args) {
        /*
        Scanner scanner=new Scanner(System.in);

        System.out.print("Yaricapı giriniz: ");
        double yaricap=scanner.nextDouble();

        Daire daire=new Daire(20,20,"mavi",yaricap);
        System.out.println(daire); // toString methodu çağrıldı
        daire.konumDegistir(30,50);
        System.out.println(daire);
        DecimalFormat frmt=new DecimalFormat("0.##");
        System.out.println("Alanı: "+frmt.format(daire.alanHesapla()));
        */

        // POLYMORPHİSM ÇOK BİÇİMLİLİK
        Daire daire1=new Daire(20,20,"sarı",5);
        Daire daire2=new Daire(20,20,"yeşil",8);
        Dikdörtgen dikdörtgen=new Dikdörtgen(70,55,"kırmızı",3,6);
        Sekil[] sekiller=new Sekil[3];
        // polymorphism sayesinde farklı referans tipinde veri toplulukları oluşturuluyor
        sekiller[0]=daire1;
        sekiller[1]=daire2;
        sekiller[2]=dikdörtgen;
        // tek tek alan hesaplamak yerine toplu işlem yapılabilir
        for(int sayac=0;sayac<3;sayac++){
            System.out.println("Alan: "+sekiller[sayac].alanHesapla());
        }
        System.out.println("**********************************************");
        // farklı moduller için aynı istemci kod kullanılabilir
        sekilYazdir(daire1);
        sekilYazdir(dikdörtgen);

        sekilYazdir2(daire2);
        sekilYazdir2(dikdörtgen);

        // yeni özellikler daha kolay eklenir
        Sekil ucgen1=new EskenarUcgen(10,5,"mor",10);
        sekilYazdir(ucgen1);
    }


    // polymorphism olmasaydı her eklenecek şekil için istemci kod değişecekti
    public  static void sekilYazdir2(Sekil genelSekil){
        if(genelSekil instanceof Daire){
            Daire daire=(Daire)genelSekil;
            System.out.println(daire);
            System.out.println("Alanı: "+daire.alanHesapla());
        }
        else if(genelSekil instanceof Dikdörtgen){
            Dikdörtgen dikdörtgen=(Dikdörtgen)genelSekil;
            System.out.println(dikdörtgen);
            System.out.println("Alanı: "+dikdörtgen.alanHesapla());
        }
    }

    // polymorphism sayesinde istemci kodu değiştirmiyoruz
    public  static void sekilYazdir(Sekil genelSekil){
            System.out.println(genelSekil);
            System.out.println("Alanı: "+genelSekil.alanHesapla());
    }
}
