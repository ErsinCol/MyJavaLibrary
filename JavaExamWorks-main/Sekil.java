public abstract class Sekil { // base class
    // soyut classlardan nesne oluşturulamaz newlenemez polmorphism referans tipler birbirlerini referans tutar

    private double konumX;
    private double konumY;
    private String renk;

    public Sekil(double konumX,double konumY,String renk){
        this.konumX=konumX;
        this.konumY=konumY;
        this.renk=renk;
    }

    public double getKonumX() {
        return konumX;
    }

    public void setKonumX(double konumX) {
        this.konumX = konumX;
    }

    public double getKonumY() {
        return konumY;
    }

    public void setKonumY(double konumY) {
        this.konumY = konumY;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
    public void konumDegistir(double x,double y){
        this.setKonumX(x);
        this.setKonumY(y);
    }

    public abstract double alanHesapla(); // imza methodu override edilmesi zorunlu method gerçekleme kısmı yok

    // object methodları toString() methodu

    public String toString(){
        return "Konumu: ("+this.getKonumX()+","+this.getKonumY()+") rengi: "+this.getRenk();
    }


}
