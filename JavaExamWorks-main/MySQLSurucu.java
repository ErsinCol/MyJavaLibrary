public class MySQLSurucu implements IVeritabanıSurucu{

    @Override
    public void baglan() {
        System.out.println("MySQL veritabanına bağlanılıyor...");
    }

    @Override
    public void sorguCalistir() {
        System.out.println("MySQL sorgusu çalıştırılıyor...");
    }

    @Override
    public void baglantiSonlandir() {
        System.out.println("MySQL veritabanı bağlantısı sonlandırılıyor...");
    }
}
