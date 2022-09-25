public class PostgreSQLSurucu implements IVeritabanıSurucu{
    @Override
    public void baglan() {
        System.out.println("PostgreSQL veritabanına bağlanılıyor...");
    }

    @Override
    public void sorguCalistir() {
        System.out.println("PostgreSQL sorgusu çalıştırılıyor...");
    }

    @Override
    public void baglantiSonlandir() {
        System.out.println("PostgreSQL veritabanı bağlantısı sonlandırılıyor...");
    }
}
