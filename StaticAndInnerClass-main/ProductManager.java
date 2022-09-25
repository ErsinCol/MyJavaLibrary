public class ProductManager { // ürünle ilgili işlemlerin yönetildiği modül

    public void add(Product product){
        if(ProductValidator.isValid(product)){ // static method nesne oluşturmadan kullandık
            System.out.println("Ürün başarıyla eklendi");
        }else{
            System.out.println("Ürün eklenemedi");
        }
    }
}
