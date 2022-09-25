import java.util.Random;
// random harflerden oluşan metinsel ifadede bir adres döndürme
public class RastgeleUretmeAraci{
    public static String rastgeleKelimeUret(int harfSayisi){
        Random random=new Random();
        // harf sayısı karakter uzunlugunda metinsel bir ifade yaratıcam
        StringBuilder sb=new StringBuilder(harfSayisi); // metinsel ifadeleri birleştirmek için kullanılır yaratılacak nesnenin karakter uzunlugu verilir
        // apend ile nesne içeriğinin sonuna yeni veri ekleyebiliriz
        for(int i=0;i<harfSayisi;i++){
            sb.append((char)('a'+random.nextInt('z'-'a'))); // bound aralık demektir
        }
        return sb.toString();
    }
}
