import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {
        // listeler aynı veri tipindeki değişkenlerden oluşur
	    /*int[] numbers={1,2,3};
        numbers[3]=4;
        for(int number: numbers){
            System.out.println(number); // ArrayIndexOutOfBoundsException var olmayan bir dizinin indisine erişim hatası
        }
        numbers=new int[4]; // newlediğimizde eski heap alanı ve değerler silinir tutulmaz
        numbers[3]=4; // int değerler deafault olarak 0 değeri alır
        for(int number: numbers){
            System.out.println(number);
        }*/
        // ARRAY LİST   object tabanlı oldugundan farklı veri   tipteki verileri içinde tutabilir ve genişlemeye imkan verir
        ArrayList numbersList=new ArrayList();
        numbersList.add(2);
        numbersList.add(2.5);
        numbersList.add("ankara");
        System.out.println(numbersList.size()); // liste boyutunu verir
        numbersList.set(1,3.5); // değişiklik yapmak düzenlemek için
        System.out.println(numbersList.get(1)); // özel olarak index içindeki veriye ulaşmak
        // bir elemanı silmek için remove kullanıyoruz o alan silinir ve liste sola kayar eleman sayısı azalır
        numbersList.remove(0);
        System.out.println(numbersList.get(0));
        // tüm liste elemanlarını silmek için clear methodu
        //numbersList.clear(); //System.out.println(numbersList.size()
        System.out.println("******************");
        for (Object list:numbersList){
                System.out.println(list);
        }

    }
}
