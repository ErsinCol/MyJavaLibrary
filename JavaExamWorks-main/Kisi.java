public class Kisi {
    private int id;
    private String ad;
    private String soyad;
    private Adres evAdresi;

    public Kisi(int id,String ad,String soyad,Adres evAdresi){
        this.setId(id);
        this.setAd(ad);
        this.setSoyad(soyad);
        this.evAdresi=evAdresi;
    }

    public Adres getEvAdresi(){
        return evAdresi;
    }
    public void setEvAdresi(Adres evAdresi){
        this.evAdresi=evAdresi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }


    @Override
    public String toString(){
        return id+","+ad+","+evAdresi.getIl(); // referans tipli bir field oluşturarak o sınıf içersindeki üyelere erişim sağlandı
    }






}
