import java.util.Iterator;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(2);

        Iterator iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(stack.pop());
        }
    }
}
