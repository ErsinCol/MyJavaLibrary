import java.util.ArrayList;
import java.util.Collections;

public class Main {
    // type safe tip güvenli demektir generic yapılar öğrenicez listeler bizim belirttiğimiz veri tipinde veriler tutabilir
    public static void main(String[] args) {
        ArrayList<String> towns=new ArrayList<String>();
        towns.add("ankara");
        towns.add("istanbul");
        towns.add("izmir");
        towns.add("aydın");
        towns.add("amasya");
        towns.remove("istanbul");
        Collections.sort(towns); // sıralama yapmak
        for (String traveling:towns){
            System.out.println(traveling);
        }
    }
}
