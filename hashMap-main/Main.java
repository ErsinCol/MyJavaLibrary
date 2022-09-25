import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// HASH-MAP bir sözlük gibi düşün bir anahtar kelime var biz o anahtar kelimenin içeriğini bir karşılığını görüyoruz

        HashMap<String,String> dictionary= new HashMap<String,String>();
        // eleman ekleme
        dictionary.put("book","kitap"); // key,value
        dictionary.put("pencil","kalem");
        dictionary.put("computer","bilgisayar");
        // anahtar sözcük toplulugu oluşturmak
        for (String item: dictionary.keySet()){
            System.out.println("eleman: "+item+" değeri: "+dictionary.get(item));
        }
        // eleman silmek
        // dictionary.remove("pencil");
        // elemana ulaşmak
        // System.out.println(dictionary.get("pencil")); // null verir yani bir referansı yok
        // tamamen silmek
        // dictionary.clear();
        // boyutu
        // dictionary.size();

    }
}
