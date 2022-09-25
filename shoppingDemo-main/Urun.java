public class Urun {
    private String ad;
    private int birimFiyati;
    private int stokmMiktari;

    Urun(String ad,int birimFiyati){
        this.setAd(ad);
        this.setBirimFiyati(birimFiyati);
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getBirimFiyati() {
        return birimFiyati;
    }

    public void setBirimFiyati(int birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

    public int getStokmMiktari() {
        return stokmMiktari;
    }

    public void setStokmMiktari(int stokmMiktari) {
        this.stokmMiktari = stokmMiktari;
    }

    @Override
    public String toString(){
        return "Ürün ismi: "+this.ad+", Birim fiyatı: "+this.birimFiyati;
    }
}
