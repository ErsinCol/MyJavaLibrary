import java.util.Scanner;

public class LoopsDemo3 {
    public static void main(String[] args) {
        // Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number=input.nextInt();
        for(int i=1;i<number;i*=5) {
            System.out.println(i);
        }
        System.out.println("***********************");
        for(int j=1;j<number;j*=4){
            System.out.println(j);
        }
    }
}
