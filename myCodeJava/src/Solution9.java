import java.util.Stack;

class Question9 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.add(node);
    }

    public int pop() {
        while (!stack1.empty()) {
            stack2.add(stack1.pop());
        }
        int temp = stack2.pop();
        while (!stack2.empty()) {
            stack1.add(stack2.pop());
        }
        return temp;
    }
}

public class Solution9 {
}
