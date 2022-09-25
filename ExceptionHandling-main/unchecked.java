public class Main {
    // HİYERAŞİ---> ArrayIndexOutOfBoundsException->IndexOutOfBoundsException->RuntimeException->Exception
    public static void main(String[] args) {
	// kodumuz compile olurken değil compile olduktan sonra çalışırken alacağımız hataları yönetme
        // olası hatalara karşı uygulamayı bug a sokmamak kırmamak çalışmaya devam edebilmesi
        try{
            int[] sayilar=new int[]{2,3,5};
            System.out.println(sayilar[5]);
        }// birden fazla hata olabileceği için catch blogu birden fazla kullanılabilir
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }// hiçbir hata eşleşmez ise sıradai blok çalışır loglama işlemleri için düşünebilir kullanıcı bir beklenmeyen hata durumunda programcıya düzeltmesi için hatanın nerden -- oludugu gibi işlemler için
        catch (Exception exception){
            System.out.println("Loglandı "+exception);
        }
        finally {
            System.out.println("Hata olsada olmasada sonunda çalışacak kısım...");
        }
        // try hata olup olmadığını deneyeceğimiz ve çalışacak blok
        // catch hata yakalandığında çalışacak blok
        // finally hata yakalansada yakalanmasada son kısımda çalışacak blok bir veritabanına bağlandığımızda işlemi
        // tamamlasakta tamamlamasakta bağlantıyı finally kısmında sonlandırabiliriz.
        // exception hiyeraşisi
        /*
            exception yazdığımız uygulamalarda kodlara yönelik yapmış oldugumuz hatalar
        exceptionu kodlar ile kontrol altına alabiliyoruz
        errorlar bizim kodlarla müdahale edemeyeceğimiz hatalardır mesela sanal makine hataları
        bütün hatalar exception classından inherit edilir yani extend edilir
        runtime exception unchecked exceptiondur bizim onları kontrol altına almamız lazım java bunları kontrol etmiyo demektir
	        arithmetic exception sayısal hatalar yani bir yaş girilsin istiyoruz belli bir sınırın dısındaysa
	        nullpointer exception referansı olmayan bir nesneyi kullanmaya çalıştığımızda
	        classcast exception tip dönüşüm hatası
	        indexoutofboundexception arraylerle alakalı sınırların dışına çıkılması
       checked exceptionlar:
	        ıo exception
	        sql exception
	        awt exception

        bütün exceptionlar exception classından inherit edilir

        */


    }
}
