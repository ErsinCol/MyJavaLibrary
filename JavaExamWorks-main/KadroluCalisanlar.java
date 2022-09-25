public class KadroluCalisanlar extends Kisi{

    public KadroluCalisanlar(String isim,int maas,String bolum){
        super(isim, maas, bolum);
    }

    public void maasHesapla(int sayi) {
        int toplam=sayi*100;
        System.out.println(toplam);
    }
}
