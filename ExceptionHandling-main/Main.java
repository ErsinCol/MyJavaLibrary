import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
	/*
	        Checked exceptions
	        derleyici tarafından kontrol edilen olulabilecek hata durumlarıdır kontrol edildiği için
	        hata blokları oluşturulamadan derlenemez dolayısıyla program çalışmaz yani belirtmek zorundayız
	        ıoexception,awt exception,sql exception örneğin
	 */

        // dosya okuma
        // bu dosya başka biryerdede kullanılabilecği veya bu method başka biyerde kullanılabilecği için (FileNotFoundException)
        // iki çözümü var throws yani hata fırlatma bu şekilde handle eden try catche yazmak zorunda ikincisi try blokları arasına yazmak
        BufferedReader bufferedReader=null;
        int total=0;
        try {
            bufferedReader=new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\exceptionChecked\\src\\towns"));
            String line=null;
            while((line=bufferedReader.readLine())!=null){
                total+=Integer.valueOf(line);
            }
            System.out.println("Sayiların toplamı: "+total);
        }catch (FileNotFoundException fileNotFoundException){ // DOSYA BULUNAMAZSA
            System.out.println(fileNotFoundException);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException exception) {
            System.out.println(exception);
        }
        finally { // dosyayı her iki türlüde kapatmak için
            try{
                bufferedReader.close();
            }catch (Exception exception) {
                System.out.println(exception);
            }
        }

    }
}
