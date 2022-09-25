public class Musteri extends Kisi {
    private String telefonNo;
    private Adres isAdresi;

    public Musteri(int id,String ad,String soyad,Adres evAdresi,String telefonNo,Adres isAdresi){
        super(id,ad,soyad,evAdresi); // constructor üyesine erişim
        this.telefonNo=telefonNo;
        this.isAdresi=isAdresi;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public Adres getIsAdresi() {
        return isAdresi;
    }

    public void setIsAdresi(Adres isAdresi) {
        this.isAdresi = isAdresi;
    }

    @Override
    public String toString(){
        return super.toString()+","+telefonNo+","+isAdresi.getIl();
    }


}
