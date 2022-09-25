import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Kisi> kisiler=new ArrayList<Kisi>(); // kisi verilerini saklayacak bir dinamik dizi oluşturma
        Adres evAdresi=null;
        Adres isAdresi=null;
        for(int i=0;i<100;i++){
            evAdresi=new Adres(i,RastgeleUretmeAraci.rastgeleKelimeUret(5),"Doğduğunuzİl");
            if(i%2==0){
                    isAdresi=new Adres(i,RastgeleUretmeAraci.rastgeleKelimeUret(5),"Sakarya");
                    kisiler.add(new Musteri(i,RastgeleUretmeAraci.rastgeleKelimeUret(5),RastgeleUretmeAraci.rastgeleKelimeUret(5),evAdresi,RastgeleUretmeAraci.rastgeleKelimeUret(5),isAdresi));
            }else{
                    kisiler.add(new Personel(i,RastgeleUretmeAraci.rastgeleKelimeUret(5),RastgeleUretmeAraci.rastgeleKelimeUret(5),evAdresi,i,RastgeleUretmeAraci.rastgeleKelimeUret(5)));
            }
        }
        // if else alternatif kullanım
        for(Kisi kisi:kisiler){
        String sinifTuru=(kisi instanceof Musteri)?"Musteri":"Personel";
        System.out.println(sinifTuru+"--->"+kisi);
        }


    }
}
