public class Yonetici extends Kisi{
     public Yonetici(String isim,int maas,String bolum){
         super(isim, maas, bolum);
     }
     public void zamYap(int zam){
         System.out.println("Çalışanlara "+zam+" Tl zam yapıldı");
     }

     public void maasHesapla(int sayi){
         int toplam=sayi*150;
         System.out.println(toplam);
     }
}
