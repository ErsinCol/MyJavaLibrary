public class YazdirmaUygulamasi {

    public static void main(String[] args) {
	    IYazıcıArayüzü yazıcıArayüzü=new CanonYazici();
        YazıcıSürücüsü yazıcıSürücüsü=new YazıcıSürücüsü(yazıcıArayüzü);
        yazıcıSürücüsü.ac();
        yazıcıSürücüsü.yazdir("Merhaba Dünya");
        yazıcıSürücüsü.kapat();
    }
}
