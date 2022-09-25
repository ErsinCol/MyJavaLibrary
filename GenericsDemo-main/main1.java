import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// birbirine benzeyen operasyonları tip güvenlikli olarak aynı formatta yazmamızı sağlar genericler

        /*
        ArrayList<String> sehirler=new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add(2); // incompatible type uyumsuz tip çünkü tip güvenlikli hale getirdik
        */

        // listeler olmasaydı genericler olmasaydı dizilerle naısl yapardık
        // temel olarak bir sınıf ve o sınıfa ait methodlara parametre gönderiyoruz bu şekilde düşün

        MyList<Product> list=new MyList<Product>();
        list.add(new Product());
        list.add(new Product());


    }
}
