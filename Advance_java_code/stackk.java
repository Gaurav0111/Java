import java.util.*;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class stackk {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        stack.push(45);
        stack.push(451);
        stack.push(452);
        stack.push(453);
        stack.push(454);

        System.out.println(stack);
        
        System.out.println(stack.peek());
        
        stack.pop();
        stack.pop();
        stack.pop();
        
        System.out.println(stack.peek());
        
        Iterator<Object> iterator = stack.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
