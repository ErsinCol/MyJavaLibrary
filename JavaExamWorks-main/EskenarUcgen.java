public class EskenarUcgen extends Sekil{

    private int kenar;

    public EskenarUcgen(double konumX,double konumY,String renk,int kenar){
        super(konumX, konumY, renk);
        this.kenar=kenar;
    }

    public int getKenar(){
        return kenar;
    }
    public void setKenar(int kenar){
        this.kenar=kenar;
    }



    @Override
    public double alanHesapla(){
        return (Math.sqrt(3)/4)*Math.pow(this.getKenar(),2);
    }
}
