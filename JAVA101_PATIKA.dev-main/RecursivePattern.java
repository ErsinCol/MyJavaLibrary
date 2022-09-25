import java.util.Scanner;

public class RecursivePattern {

    static int pattern(int n,String islem,int tempN) {
        // n>0 yaz n , n-5
        // n<0 yaz n , n+5
        if(n>0 && islem=="azalt"){
            System.out.print(n+" ");
            return pattern(n-5,islem,tempN);
        }else{
            islem="arttır";
            System.out.print(n+" ");
            if(n==tempN){
                return tempN;
            }else{
                return pattern(n+5,islem,tempN);
            }
        }
    }



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("N sayısı: ");
        int n= input.nextInt();
        int tempN=n;
        String islem="azalt";
        pattern(n,islem,tempN);
    }
}
