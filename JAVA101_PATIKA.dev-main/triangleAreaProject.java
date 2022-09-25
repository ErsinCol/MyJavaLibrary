import java.util.Scanner;

public class triangleAreaProject {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        // Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        /*
            Formül
            Üçgenin çevresi: 2u
            u=(a+b+c)/2;
            alan*alan=u*(u-a)*(u-b)*(u-c)
         */
        System.out.println("Birinci kenar uzunluğunu giriniz: ");
        int kenar1=input.nextInt();
        System.out.println("İkinci kenar uzunluğunu giriniz: ");
        int kenar2=input.nextInt();
        System.out.println("Üçüncü kenar uzunluğunu giriniz: ");
        int kenar3=input.nextInt();
        double u=(kenar1+kenar2+kenar3)/2;
        double alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Üçgenin Alanı: "+alan);

        /*
            Hipotenüs hesaplayan program

            System.out.println("Birinci kenar uzunluğunu giriniz: ");
            int kenar1=input.nextInt();
            System.out.println("İkinci kenar uzunluğunu giriniz: ");
            int kenar2=input.nextInt();
            double hipotenus=Math.sqrt(Math.pow(kenar1,2)+Math.pow(kenar2,2));
            System.out.println("Hipotenüs: "+hipotenus);
        */








    }
}
