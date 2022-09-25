import java.util.Scanner; // scanner output tan data okumaya yarıyor
import matematik.DortIslem;
import matematik.Logaritma;
//import matematik.*; package altındaki tüm sınıfları görür
public class Main {
    // javanın kendi içindeki paketler built-in packages
    // bir paketi bir projede kullanmak istiyorsan onu import etmen gerekiyo
    // paket gruplama için çok iyi ve başka yerde bu paketi kullanmak

    public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number= scanner.nextInt();
        System.out.println("Girilen sayı: "+number);
        DortIslem dortIslem=new DortIslem();
        System.out.println(dortIslem.topla(10,5));
        System.out.println(dortIslem.cıkar(10,5));
        System.out.println(dortIslem.carp(10,5));
        System.out.println(dortIslem.bölme(10,5));
        Logaritma logaritma=new Logaritma();
        System.out.println("Logaritması : "+ logaritma.logaritma());
    }
}
