import java.util.Random;

public class RastgeleUretmeAraci {
    public static String rastgeleKelimeUret(int harfSayisi){
        Random r =new Random();
        StringBuilder sb=new StringBuilder(harfSayisi); // StringBuilder nesnesi ise bir kez yaratılır ve daha sonra yeni veriler bu nesneye eklenir.
        for(int i=0;i<harfSayisi;i++){
            sb.append((char)('a'+((r.nextInt('z'-'a')))));
        }
        return sb.toString();
    }
}
