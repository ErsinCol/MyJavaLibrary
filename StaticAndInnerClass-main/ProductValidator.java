// static kullanımı utility lerde kullanabiliriz
// statik değişkenler için hafızada bir kez yer açılır oluşturulan her bir nesne için hafızada tekrar bir yer kaplamazlar
// nesneye bağlı olmadan oluşturuldukların için nesne yaratılmadan erişilebilir
// uygulama sfırlanana kadar static bellekten atılmıyor newlediğimiz zaman işimiz bittiğinde atılıyordu
// ilk çağrılan yerde nesne oluşturulur sonrasında tüm çağrılışlarda o nesne kullanılır
// manager sınıflar asla static yapılmaz
// yardımcı araçlarda kullan bırak araçlarda yapılabilir
// contructor staticte çalışmaz c#ta çalışır farklıdır
public class ProductValidator { // validator doğrulama işlemleri için bir modül
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()) { // isEmpty check input string
            return true;
        }else{
            return false;
        }
    }
}
