public class Personel extends Kisi{
    private int sicilNo;
    private String bolum;

    Personel(int id,String ad,String soyad,Adres evAdresi,int sicilNo,String bolum){
        super(id, ad, soyad, evAdresi);
        this.setSicilNo(sicilNo);
        this.setBolum(bolum);
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString(){
        return super.toString()+","+bolum;
    }
}
