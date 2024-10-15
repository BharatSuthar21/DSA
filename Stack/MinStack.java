import java.util.ArrayList;
import java.util.List;

class MinStack {
    List<int[]> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        int minTill = stack.isEmpty() ? val : stack.get(stack.size() - 1)[1]; // Handle the empty stack case
        int min = Math.min(val, minTill);
        int[] ele = {val, min};
        stack.add(ele);
    }

    public int pop() {
        if (!stack.isEmpty()) {
            int min = stack.get(stack.size()-1)[0];
            stack.remove(stack.size() - 1);
            return min;
        }
        return Integer.MIN_VALUE;
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1)[0];
        }
        throw new IllegalStateException("Stack is empty");
    }

    public int getMin() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1)[1];
        }
        throw new IllegalStateException("Stack is empty");
    }


    public static void main(String args[]){
        MinStack stack = new MinStack();
        stack.push(0);
        stack.push(-1);
        System.out.println(stack.getMin());
        System.out.println(stack.pop());
        
    }
}
