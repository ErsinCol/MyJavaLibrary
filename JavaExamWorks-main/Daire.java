public class Daire extends Sekil{ // derived class
    private double yaricap;

    public Daire(double konumX,double konumY,String renk,double yaricap){
        super(konumX, konumY, renk);
        this.yaricap=yaricap;
    }

    public double getYaricap(){
        return yaricap;
    }
    public void setYaricap(double yaricap){
        this.yaricap=yaricap;
    }

    @Override
    public double alanHesapla(){
        return Math.pow(yaricap,2)*Math.PI;
    }
}
