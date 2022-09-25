import java.util.Scanner;

public class passToClassSystem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int total=0,sayac=0;
        System.out.print("Matematik notunuz: ");
        int math=input.nextInt();
        if(math>=0 && math<=100){
            total+=math;
            sayac++;
        }
        System.out.print("Fizik notunuz: ");
        int physics=input.nextInt();
        if(physics>=0 && physics<=100){
            total+=physics;
            sayac++;
        }
        System.out.print("Türkçe notunuz: ");
        int turkish=input.nextInt();
        if(turkish>=0 && turkish<=100){
            total+=turkish;
            sayac++;
        }
        System.out.print("Kimya notunuz: ");
        int chemistry=input.nextInt();
        if(chemistry>=0 && chemistry<=100){
            total+=chemistry;
            sayac++;
        }
        System.out.print("Müzik notunuz: ");
        int music=input.nextInt();
        if(music>=0 && music<=100){
            total+=music;
            sayac++;
        }
        double average=total/sayac;
        System.out.println("Ortalamanız: "+average);
        if(average>=55){
            System.out.println("Sınıfı geçtiniz...");
        }else{
            System.out.println("Sınıfta kaldınız...");
        }



    }
}
