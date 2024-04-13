import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class practiceQueue extends Main{
    public static void main(String[] args) 
    {
        Queue<Integer> result= new LinkedList<>();
        result.add(10);
        result.add(15);
        result.add(20);
        result.add(25);
        result.add(30);

        System.out.println(result.peek());
        System.out.println(result.peek());
        System.out.println(result.peek());
        System.out.println();

        System.out.println(result.remove());
        System.out.println(result.remove());
        System.out.println(result.remove()); System.out.println(result.remove());


        Deque<Integer> deque=new LinkedList<>();
    
        String nameString=" ";
    }
}
