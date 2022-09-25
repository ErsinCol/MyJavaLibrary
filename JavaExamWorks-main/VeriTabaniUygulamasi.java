public class VeriTabaniUygulamasi {

    public static void main(String[] args) {
        IVeritabanıSurucu iVeritabanıSurucu=new MySQLSurucu();
        VeritabanıİslemleriRepository veritabanıİslemleriRepository=new VeritabanıİslemleriRepository(iVeritabanıSurucu);
        veritabanıİslemleriRepository.ekle();
        veritabanıİslemleriRepository.idAra(3);
        veritabanıİslemleriRepository.listele();
        veritabanıİslemleriRepository.sil();
        veritabanıİslemleriRepository.güncelle();
    }
}
