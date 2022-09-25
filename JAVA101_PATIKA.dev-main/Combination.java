import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kümeniz kaç elemandan oluşuyor: ");
        int n=input.nextInt();
        System.out.println("Oluşturulacak gruplar kaç elemanlı: ");
        int r=input.nextInt();
        int nFakt=1;
        int rFakt=1;
        int n_rFakt=1;
        for (int i=1;i<=n;i++){
            nFakt*=i;
        }
        for(int j=1;j<=r;j++){
            rFakt*=j;
        }
        for (int z=1;z<=n-r;z++){
            n_rFakt*=z;
        }
        double combination=nFakt/(rFakt*n_rFakt);
        System.out.println("Kombinasyon: "+combination);
        
    }
}
