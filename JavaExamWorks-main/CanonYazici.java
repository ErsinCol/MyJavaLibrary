public class CanonYazici implements IYazıcıArayüzü{
    @Override
    public void ac() {
            System.out.println("CANON yazıcı çalışmaya başlıyor...");
    }

    @Override
    public void yazdir(String mesaj) {
        System.out.println("CANON yazıcı "+mesaj+" yazdırıyor...");
    }

    @Override
    public void kapat() {
        System.out.println("CANON yazıcı kapanıyor...");
    }
}
