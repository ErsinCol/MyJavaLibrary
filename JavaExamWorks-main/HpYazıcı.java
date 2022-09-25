public class HpYazıcı implements IYazıcıArayüzü{
    @Override
    public void ac() {
        System.out.println("HP yazıcı çalışmaya başlıyor...");
    }

    @Override
    public void yazdir(String mesaj) {
        System.out.println("HP yazıcı "+mesaj+" yazdırıyor...");
    }

    @Override
    public void kapat() {
        System.out.println("HP yazıcı kapanıyor...");
    }
}
