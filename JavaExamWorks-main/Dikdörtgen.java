public class Dikdörtgen extends Sekil{
    private double uzunluk;
    private double genislik;

    public Dikdörtgen(double konumX,double konumY,String renk,double uzunluk,double genislik){
        super(konumX, konumY, renk);
        this.genislik=genislik;
        this.uzunluk=uzunluk;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    @Override
    public double alanHesapla(){
        return this.getGenislik()*this.getUzunluk();
    }


}
