import java.util.Scanner;

public class CircleOperations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        int radius=input.nextInt();
        radius=(radius<0)?-radius:radius;
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz: ");
        int centralAngel=input.nextInt();
        centralAngel=(centralAngel>360)?centralAngel%360:centralAngel;
        double pi=3.14;
        double circleArea=(pi*(Math.pow(radius,2))*centralAngel)/360;
        System.out.println("Daire diliminin alanı: "+circleArea);


        /*
        System.out.print("Dairenin yarıçapını giriniz: ");
        int radius=input.nextInt();
        double pi=3.14;
        double circleArea=pi*(Math.pow(radius,2));
        double circlePerimeter=2*pi*radius;
        System.out.println("Dairenin alanı: "+circleArea);
        System.out.println("Dairenin çevresi: "+circlePerimeter );
        */
    }
}
