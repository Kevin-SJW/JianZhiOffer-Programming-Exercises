package JianZhiOffer;

import java.util.Stack;

/*解题思路
两个栈 stack1 和 stack2:

push 动作都在 stack1 中进行，
pop 动作在 stack2 中进行。当 stack2 不为空时，
直接 pop，当 stack2 为空时，先把 stack1 中的元素 pop 出来，
push 到 stack2 中，再从 stack2 中 pop 元素。*/
public class doubleStackIntoOneQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack1.isEmpty() && stack2.isEmpty())
            throw new RuntimeException("Queue is empty!");
        int node;
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                node = stack1.pop();
                stack2.push(node);
            }
        }
        return stack2.pop();

    }
}
