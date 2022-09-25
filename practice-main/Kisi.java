public abstract class Kisi {
    private int id;
    private String ad;
    private String soyad;
    private Adres evAdresi;

    Kisi(int id,String ad,String soyad,Adres evAdresi){
        this.setId(id);
        this.setAd(ad);
        this.setSoyad(soyad);
        this.setEvAdresi(evAdresi);
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

    public Adres getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(Adres evAdresi) {
        this.evAdresi = evAdresi;
    }

    @Override
    public String toString(){
        return id+","+ad+","+evAdresi.getIl();
    }
}
