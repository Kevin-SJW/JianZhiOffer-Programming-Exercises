package JianZhiOffer;


/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
/*题目描述
输入两个链表，找出它们的第一个公共结点。

解题思路
如果两个链表存在公共结点，那么它们从公共结点开始一直到链表的结尾都是一样的，因此我们只需要从链表的结尾开始，
往前搜索，找到最后一个相同的结点即可。但是题目给出的单向链表，我们只能从前向后搜索，
这时，我们就可以借助栈来完成。先把两个链表依次装到两个栈中，然后比较两个栈的栈顶结点是否相同，
如果相同则出栈，如果不同，那最后相同的结点就是我们要的返回值。
还有一种方法，不需要借助栈。先找出2个链表的长度，然后让长的先走两个链表的长度差，然后再一起走，
直到找到第一个公共结点。*/
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
