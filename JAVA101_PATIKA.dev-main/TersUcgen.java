import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        // Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
        Scanner input=new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int digit=input.nextInt();
        for(int i=1;i<=digit;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int z=(digit*2)-i;z>=i;z--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
