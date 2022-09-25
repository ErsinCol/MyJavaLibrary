public class Main {

    public static void main(String[] args) {
	/*
	        repository design pattern

	        repository veritabanı işlemlerinin bir merkezden yapılmasını sağlar
	        bu şekilde sorgu ve kod tekrarı önlenir iş katmanında sorgular tek tek yazılmaz
	        asıl işi yapan bölümler ile veriye erişen bölümlerin birbirinden soyutlanmasını sağlar
	        veri katmanı ve iş katmanı arasında görev alır	 */
        Validator validator=new Validator();
        Customer customer=new Customer();
        validator.validate(customer);
    }
}
