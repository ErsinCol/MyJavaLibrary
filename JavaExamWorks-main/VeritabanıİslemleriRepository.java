public class VeritabanıİslemleriRepository  {

    /*
        her veritabanı için burayı değiştirmem gerekir
    private PostgreSQLSurucu sqlSurucu;
    private MySQLSurucu mySQLSurucu;
    ................................
        her veri tabanı sürücüsü içinde burayı değiştirmem gerekirdi
     public VeritabanıİslemleriRepository(PostgreSQLSurucu postgreSQLSurucu){}
     ........................................................................
     ........................................................................
    */
    private IVeritabanıSurucu iVeritabanıSurucu; // referans oluşturdum
    // dependency injeciton ile nesne dışarıdan oluşturulup istemci koda gönderiliyor
    public VeritabanıİslemleriRepository(IVeritabanıSurucu iveritabanıSurucu){
        this.iVeritabanıSurucu=iveritabanıSurucu;
    }

    public void ekle() {
        iVeritabanıSurucu.baglan();
        System.out.println("Ekleme işlemi yapılıyor...");
        iVeritabanıSurucu.sorguCalistir();
        iVeritabanıSurucu.baglantiSonlandir();
    }

    public void idAra(int id){
        iVeritabanıSurucu.baglan();
        System.out.println(id+ " nolu kayıt için arama işlemi yapılıyor...");
        iVeritabanıSurucu.sorguCalistir();
        iVeritabanıSurucu.baglantiSonlandir();
    }

    public void listele() {
        iVeritabanıSurucu.baglan();
        System.out.println("Listeleme işlemi yapılıyor...");
        iVeritabanıSurucu.sorguCalistir();
        iVeritabanıSurucu.baglantiSonlandir();
    }

    public void sil() {
        iVeritabanıSurucu.baglan();
        System.out.println("Silme işlemi yapılıyor...");
        iVeritabanıSurucu.sorguCalistir();
        iVeritabanıSurucu.baglantiSonlandir();
    }

    public void güncelle() {
        iVeritabanıSurucu.baglan();
        System.out.println("Güncelleme işlemi yapılıyor...");
        iVeritabanıSurucu.sorguCalistir();
        iVeritabanıSurucu.baglantiSonlandir();
    }




}
