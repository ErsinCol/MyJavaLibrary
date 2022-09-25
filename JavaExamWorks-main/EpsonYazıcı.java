public class EpsonYazıcı implements IYazıcıArayüzü{
    @Override
    public void ac() {
        System.out.println("EPSON yazıcı çalışmaya başlıyor...");
    }

    @Override
    public void yazdir(String mesaj) {
        System.out.println("EPSON yazıcı "+mesaj+" yazdırıyor...");
    }

    @Override
    public void kapat() {
        System.out.println("EPSON yazıcı kapanıyor...");
    }
}
