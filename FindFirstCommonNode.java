package JianZhiOffer;


/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
/*��Ŀ����
�������������ҳ����ǵĵ�һ��������㡣

����˼·
�������������ڹ�����㣬��ô���Ǵӹ�����㿪ʼһֱ������Ľ�β����һ���ģ��������ֻ��Ҫ������Ľ�β��ʼ��
��ǰ�������ҵ����һ����ͬ�Ľ�㼴�ɡ�������Ŀ�����ĵ�����������ֻ�ܴ�ǰ���������
��ʱ�����ǾͿ��Խ���ջ����ɡ��Ȱ�������������װ������ջ�У�Ȼ��Ƚ�����ջ��ջ������Ƿ���ͬ��
�����ͬ���ջ�������ͬ���������ͬ�Ľ���������Ҫ�ķ���ֵ��
����һ�ַ���������Ҫ����ջ�����ҳ�2������ĳ��ȣ�Ȼ���ó���������������ĳ��ȲȻ����һ���ߣ�
ֱ���ҵ���һ��������㡣*/
import java.util.Stack;
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        while(pHead1 != null){
            s1.push(pHead1);
            pHead1 = pHead1.next;
        }
        while(pHead2 != null){
            s2.push(pHead2);
            pHead2 = pHead2.next;
        }

        ListNode res = null;
        while(!s1.isEmpty() && !s2.isEmpty() && s1.peek() == s2.peek()){
            s1.pop();
            res = s2.pop();
        }
        return res;
    }
}
