import java.util.ArrayList;
import java.util.List;

public class Siparis {
    private int siparisNo;
    private String siparisTarihi;
    private List<SiparisKalemi> siparisler=new ArrayList<>();

    Siparis(int siparisNo,String siparisTarihi){
        this.setSiparisNo(siparisNo);
        this.setSiparisTarihi(siparisTarihi);
    }

    public int getSiparisNo() {
        return siparisNo;
    }

    public void setSiparisNo(int siparisNo) {
        this.siparisNo = siparisNo;
    }

    public String getSiparisTarihi() {
        return siparisTarihi;
    }

    public void setSiparisTarihi(String siparisTarihi) {
        this.siparisTarihi = siparisTarihi;
    }

    public List<SiparisKalemi> getSiparisler() {
        return siparisler;
    }

    public void setSiparisler(List<SiparisKalemi> siparisler) {
        this.siparisler = siparisler;
    }

    public void sepeteEkle(Urun urun,Siparis siparis,int miktar){
        SiparisKalemi siparisKalemi=new SiparisKalemi(urun, siparis, miktar);
        siparisler.add(siparisKalemi);
    }
    public void siparisGoster(){
        System.out.println(siparisler);
    }

     @Override
    public String toString(){
        return "Siparis{"+"siparisNo="+siparisNo+", siparisTarihi= "+siparisTarihi+"}";
     }
}
