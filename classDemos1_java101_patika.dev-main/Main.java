public class Main {
    public static void main(String[] args) {

        Car audi=new Car("Audi A5","Sedan","Black",150);
        Car bmw=new Car("BMW İ4","Elektrikli","White",250);

        Car mercedes=new Car();
        mercedes.model="Mercedes E180";
        mercedes.type="Spor";
        mercedes.color="Red";
        mercedes.speed=200;

        audi.printInfo();
        bmw.printInfo();
        mercedes.printInfo();

    }
}
