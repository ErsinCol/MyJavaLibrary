public class Kitap {
    private String kitapAdi;
    private double birimFiyatı;

    public Kitap(String kitapAdi,double birimFiyatı){
        this.kitapAdi=kitapAdi;
        this.birimFiyatı=birimFiyatı;
    }

    public String getKitapAdi(){
        return kitapAdi;
    }
    public void setKitapAdi(String kitapAdi){
        this.kitapAdi=kitapAdi;
    }
    public double getBirimFiyatı(){
        return birimFiyatı;
    }
    public void setBirimFiyatı(double birimFiyatı){
        this.birimFiyatı=birimFiyatı;
    }
    @Override
    public String toString(){
        return "KİTAP{"+" adı: "+kitapAdi+"/"+" birim fiyatı: "+birimFiyatı+"}";
    }
}
