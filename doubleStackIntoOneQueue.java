package JianZhiOffer;

import java.util.Stack;

/*����˼·
����ջ stack1 �� stack2:

push �������� stack1 �н��У�
pop ������ stack2 �н��С��� stack2 ��Ϊ��ʱ��
ֱ�� pop���� stack2 Ϊ��ʱ���Ȱ� stack1 �е�Ԫ�� pop ������
push �� stack2 �У��ٴ� stack2 �� pop Ԫ�ء�*/
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
