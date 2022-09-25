
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        int[] list={5,3,6,15,4,72,98,7};
        for(int i=1;i<list.length;i++){
            int key=list[i];
            int j=i-1;

            while(j>=0 && list[j]>key){
                list[j+1]=list[j];
                j--;
            }
            list[j+1]=key;
        }
        for(int i:list){
            System.out.print(i+" ");
        }

        /*
        for(int x:list){
            System.out.print(x+", ");
        }
        int gecici=0;
        for(int i=0;i<list.length;i++){
            for(int j=i+1;j< list.length;j++){
                if(list[j]<list[i]){
                    gecici=list[j];
                    list[j]=list[i];
                    list[i]=gecici;
                }
            }
        }
        System.out.println();
        for(int x:list){
            System.out.print(x+", ");
        }
        */


    }
}
