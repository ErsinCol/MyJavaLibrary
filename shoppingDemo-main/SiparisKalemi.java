public class SiparisKalemi {
        private Urun urun;
        private Siparis siparis;
        private int miktar;

        SiparisKalemi(Urun urun,Siparis siparis,int miktar){
            this.setUrun(urun);
            this.setSiparis(siparis);
            this.setMiktar(miktar);
        }


    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public Siparis getSiparis() {
        return siparis;
    }

    public void setSiparis(Siparis siparis) {
        this.siparis = siparis;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    @Override
    public String toString(){
        return "Siparis Kalemi{"+"urun: "+urun+" ,siparisKalemi= "+siparis+", miktar= "+miktar;
    }
}
