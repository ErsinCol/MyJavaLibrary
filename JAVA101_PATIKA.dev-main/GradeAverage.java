import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("math grade: ");
        int math=input.nextInt();
        System.out.print("physics grade: ");
        int physics=input.nextInt();
        System.out.print("chemistry grade: ");
        int chemistry=input.nextInt();
        System.out.print("turkish grade: ");
        int turkish=input.nextInt();
        System.out.print("music grade: ");
        int music=input.nextInt();
        System.out.print("history grade: ");
        int history=input.nextInt();

        int total=math+physics+chemistry+turkish+music+history;
        double average=total/6;

        System.out.println("Average: "+average);

        String result=(average>=60)?"Sınıfı geçti":"Sınıfta kaldı";
        System.out.println(result);

    }
}
