import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Urunler urunler=new Urunler();
        Scanner scanner = new Scanner(System.in);
        String answer=null;
        do {
            System.out.println("Product name: ");
            String product = scanner.nextLine();
            urunler.books.add(product);
            System.out.println("Are you want to add product YES(Y) NO(N)");
            answer=scanner.nextLine();
        }while(answer.equalsIgnoreCase("Y"));

        System.out.println("Sepete eklenen ürünler: "+ urunler.books);*/

        ArrayList<Books> books=new ArrayList<Books>();
        Books kitaplar=new Books();
        books.add(new Books("sefiller","victor hugo","farklı yayınevi",512));
        books.add(new Books("suç ve ceza","Fyodor Mihayloviç Dostoyevski","kültür yayınevi",704));
        books.add(new Books("anna karenina","Lev N. Tolstoy","dilara yayınevi",1062));
        System.out.println("Books in List");
        for (Books travelling:books){
            System.out.println(travelling.bookName);
        }



    }
}
