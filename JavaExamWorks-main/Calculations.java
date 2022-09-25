public class Calculations {
    private double number1;
    private double number2;

    public Calculations(double number1,double number2){
        this.number1=number1;
        this.number2=number2;
    }

    public double getNumber1(){
        return number1;
    }
    public void setNumber1(int number1){
        this.number1=number1;
    }
    public double getNumber2(){
        return number2;
    }
    public void setNumber2(int number2){
        this.number2=number2;
    }

    public double total(){
        return number1+number2;
    }
    public double subtract(){
        return  number1-number2;
    }
    public double multiplication(){
        return  number1*number2;
    }
    public double division(){
        return  number1/number2;
    }

}
