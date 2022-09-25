public class Car {
    String model;
    String type;
    String color;
    int speed;

    // constructor yapıcı metod nesne tanımlanırken varsayılan ayarların yapılmasını sağlar
    Car(String model,String type,String color,int speed){
        this.model=model;
        this.type=type;
        this.color=color;
        this.speed=speed;
    }
    // parametresiz constructor
    Car(){

    }

    void increaseSpeed(int increment){
        this.speed+=increment;
    }

    void decreaseSpeed(int decrease){
        if(this.speed>0){
            this.speed-=decrease;
        }
    }

   void printInfo(){
       System.out.println("==================");
       System.out.println("Model: "+this.model);
       System.out.println("Type: "+this.type);
       System.out.println("Color: "+this.color);
       System.out.println("Speed: "+this.speed);

   }
}
