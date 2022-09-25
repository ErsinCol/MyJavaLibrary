public class YazıcıSürücüsü implements IYazıcıArayüzü{
    private IYazıcıArayüzü yazıcıArayüzü;

    public YazıcıSürücüsü(IYazıcıArayüzü yazıcıArayüzü){
        this.yazıcıArayüzü=yazıcıArayüzü;
    }

    @Override
    public void ac() {
        yazıcıArayüzü.ac();
    }

    @Override
    public void yazdir(String mesaj) {
        yazıcıArayüzü.yazdir(mesaj);
    }

    @Override
    public void kapat() {
        yazıcıArayüzü.kapat();
    }
}
