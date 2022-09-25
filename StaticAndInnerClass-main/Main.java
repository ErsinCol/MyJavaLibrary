public class Main {
    // ana class static olamıyor ben bir class ı static yapıp içersindeki herşeye nesnesiz oluşmaya çalışıcaksam
    // ancak inner class static olabilir bir class içersinde class tanımlayacaksam
    // inner class gruplama yaparsın ancak solid single responsibility prensibine yani bir classın bir işi olsuna aykırı
    public static void main(String[] args) {
       Product product=new Product();
       ProductManager productManager=new ProductManager();
       product.name="mouse";
       product.price=10;
       productManager.add(product);


       DatabaseHelper.Crud.create(); // nesne oluşturmadan direkt sınıf adıyla modül içersine erişim
    }
}
