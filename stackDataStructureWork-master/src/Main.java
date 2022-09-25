import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack stack=new Stack();
        if(stack.empty())
        {
            System.out.println("Yapımız boş...");
        }
        stack.push("İstanbul");
        stack.push("İzmir");
        stack.push("Ankara");
        stack.push("Rize");
        System.out.println(stack);
        System.out.println(stack.search("Rize"));
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
