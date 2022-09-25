import java.util.ArrayList;
import java.util.List;

public class LabUygulamasi {
    public static void main(String[] args) {
        List<Kisi> kisilerinListesi=new ArrayList<Kisi>();

        Adres evAdresi=null;
        Adres isAdresi=null;

        for(int i=0;i<100;i++){
            evAdresi=new Adres(i,RastgeleUretmeAraci.rastgeleKelimeUret(5),"İstanbul");
            if(i%2==0){
                isAdresi=new Adres(i,RastgeleUretmeAraci.rastgeleKelimeUret(5),"Sakarya");
                kisilerinListesi.add(new Musteri(i,RastgeleUretmeAraci.rastgeleKelimeUret(5),RastgeleUretmeAraci.rastgeleKelimeUret(5),evAdresi,RastgeleUretmeAraci.rastgeleKelimeUret(5),isAdresi));
            }else{
                kisilerinListesi.add(new Personel(i,RastgeleUretmeAraci.rastgeleKelimeUret(5),RastgeleUretmeAraci.rastgeleKelimeUret(5),evAdresi,i,RastgeleUretmeAraci.rastgeleKelimeUret(5)));
            }
        }

        for(Kisi item:kisilerinListesi){
            String sinifTuru=(item instanceof Musteri)?"Müşteri":"Personel";
            System.out.println(sinifTuru+"--->"+item);
        }


    }


}
